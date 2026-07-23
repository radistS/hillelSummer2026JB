package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Графічна (Swing) версія гри "Хрестики-нулики".
 * Людина грає X (клікає мишею по клітинках), комп'ютер грає O.
 *
 * Стратегія комп'ютера:
 *  1) якщо є хід, що приносить комп'ютеру перемогу зараз - зробити його;
 *  2) інакше, якщо людина може виграти наступним ходом - заблокувати цю клітинку;
 *  3) інакше - випадкова вільна клітинка.
 */
public class TicTacToeUI extends JFrame {

    private static final int SIZE = 3;
    private static final char EMPTY = ' ';
    private static final char HUMAN = 'X';
    private static final char COMPUTER = 'O';

    private final char[][] board = new char[SIZE][SIZE];
    private final JButton[][] cellButtons = new JButton[SIZE][SIZE];
    private final JLabel statusLabel = new JLabel();
    private final Random random = new Random();

    private boolean gameOver = false;

    public TicTacToeUI() {
        super("Хрестики-нулики");
        initializeBoard();
        buildUserInterface();
        updateStatus("Ваш хід (X). Клікніть по клітинці.");
    }

    /**
     * Заповнює масив поля символом-«пустушкою».
     */
    private void initializeBoard() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                board[row][col] = EMPTY;
            }
        }
    }

    /**
     * Будує все графічне вікно: панель статусу, сітку клітинок, кнопку "Нова гра".
     */
    private void buildUserInterface() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        statusLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
        statusLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(statusLabel, BorderLayout.NORTH);

        JPanel gridPanel = new JPanel(new GridLayout(SIZE, SIZE, 6, 6));
        gridPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                JButton button = new JButton("");
                button.setFont(new Font("SansSerif", Font.BOLD, 48));
                button.setFocusPainted(false);
                button.setPreferredSize(new Dimension(100, 100));

                final int clickedRow = row;
                final int clickedCol = col;
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        handleHumanMove(clickedRow, clickedCol);
                    }
                });

                cellButtons[row][col] = button;
                gridPanel.add(button);
            }
        }
        add(gridPanel, BorderLayout.CENTER);

        JButton newGameButton = new JButton("Нова гра");
        newGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                resetGame();
            }
        });
        JPanel bottomPanel = new JPanel();
        bottomPanel.add(newGameButton);
        add(bottomPanel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * Обробляє клік людини по клітинці: перевіряє коректність ходу,
     * ставить X, перевіряє завершення гри і, якщо гра триває, передає хід комп'ютеру.
     */
    private void handleHumanMove(int row, int col) {
        if (gameOver) {
            return;
        }
        if (board[row][col] != EMPTY) {
            updateStatus("Ця клітинка вже зайнята. Оберіть іншу.");
            return;
        }

        placeMark(row, col, HUMAN);

        if (checkWinner(HUMAN)) {
            updateStatus("Ви перемогли!");
            finishGame();
            return;
        }
        if (isBoardFull()) {
            updateStatus("Нічия!");
            finishGame();
            return;
        }

        updateStatus("Хід комп'ютера...");
        // Невелика затримка, щоб було видно черговість ходів.
        Timer timer = new Timer(400, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                ((Timer) event.getSource()).stop();
                makeComputerMove();
            }
        });
        timer.setRepeats(false);
        timer.start();
    }

    /**
     * Комп'ютер обирає клітинку: спочатку намагається виграти,
     * потім - заблокувати перемогу людини, інакше - хід випадковий.
     */
    private void makeComputerMove() {
        if (gameOver) {
            return;
        }

        int[] move = findWinningMove(COMPUTER);
        if (move == null) {
            move = findWinningMove(HUMAN);
        }
        if (move == null) {
            move = findRandomFreeCell();
        }

        placeMark(move[0], move[1], COMPUTER);

        if (checkWinner(COMPUTER)) {
            updateStatus("Переміг комп'ютер!");
            finishGame();
            return;
        }
        if (isBoardFull()) {
            updateStatus("Нічия!");
            finishGame();
            return;
        }

        updateStatus("Ваш хід (X). Клікніть по клітинці.");
    }

    /**
     * Шукає клітинку, куди якщо поставити символ player, той відразу виграє.
     * Повертає {row, col} або null, якщо такої клітинки немає.
     */
    private int[] findWinningMove(char player) {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] != EMPTY) {
                    continue;
                }
                board[row][col] = player;
                boolean wins = checkWinner(player);
                board[row][col] = EMPTY;
                if (wins) {
                    return new int[] { row, col };
                }
            }
        }
        return null;
    }

    /**
     * Повертає координати випадкової вільної клітинки.
     */
    private int[] findRandomFreeCell() {
        int row;
        int col;
        do {
            row = random.nextInt(SIZE);
            col = random.nextInt(SIZE);
        } while (board[row][col] != EMPTY);
        return new int[] { row, col };
    }

    /**
     * Ставить символ на поле і оновлює відповідну кнопку інтерфейсу.
     */
    private void placeMark(int row, int col, char player) {
        board[row][col] = player;
        JButton button = cellButtons[row][col];
        button.setText(String.valueOf(player));
        if (player == HUMAN) {
            button.setForeground(new Color(0, 90, 200));
        } else {
            button.setForeground(new Color(200, 50, 50));
        }
    }

    /**
     * Перевіряє всі 8 можливих виграшних ліній для заданого гравця.
     */
    private boolean checkWinner(char player) {
        for (int i = 0; i < SIZE; i++) {
            boolean rowWin = true;
            boolean colWin = true;
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] != player) {
                    rowWin = false;
                }
                if (board[j][i] != player) {
                    colWin = false;
                }
            }
            if (rowWin || colWin) {
                return true;
            }
        }

        boolean diagMain = true;
        for (int i = 0; i < SIZE; i++) {
            if (board[i][i] != player) {
                diagMain = false;
                break;
            }
        }
        if (diagMain) {
            return true;
        }

        boolean diagAnti = true;
        for (int i = 0; i < SIZE; i++) {
            if (board[i][SIZE - 1 - i] != player) {
                diagAnti = false;
                break;
            }
        }
        return diagAnti;
    }

    /**
     * Перевіряє, чи всі клітинки поля заповнені (нічия).
     */
    private boolean isBoardFull() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Завершує партію: блокує подальші кліки по клітинках.
     */
    private void finishGame() {
        gameOver = true;
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                cellButtons[row][col].setEnabled(false);
            }
        }
    }

    /**
     * Починає нову партію: очищає поле, розблоковує клітинки, скидає статус.
     */
    private void resetGame() {
        initializeBoard();
        gameOver = false;
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                JButton button = cellButtons[row][col];
                button.setText("");
                button.setEnabled(true);
            }
        }
        updateStatus("Ваш хід (X). Клікніть по клітинці.");
    }

    private void updateStatus(String message) {
        statusLabel.setText(message);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                TicTacToeUI gameWindow = new TicTacToeUI();
                gameWindow.setVisible(true);
            }
        });
    }
}
