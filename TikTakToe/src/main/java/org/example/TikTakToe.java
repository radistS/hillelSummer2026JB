package org.example;

import java.util.Random;
import java.util.Scanner;

public class TikTakToe {
    //Розмір поля
    private static final int SIZE = 3;

    //Позначення клітинок
    private static final String EMPTY = " ";
    private static final String USER = "X";
    private static final String COMPUTER = "O";

    static void main(String[] args) {
        System.out.println("Запрошуємо до гри...");
        System.out.println("Ви граєте за Х, компютер грає за 0");
        System.out.println("Для ходу треба ввести номер рядка і стовпця (через пробіл) від 1 до 3 ");

        Scanner sc = new Scanner(System.in);


        String [][] board = createBoard();
        while (true){
            makePlayerMove(board, sc);
            ptintBoard(board);
            if (hasWon(board, USER)){
                System.out.println("User won");
                break;
            }
            if (isDraw(board)){
                System.out.println("is Draw");
                break;
            }
            makeComputerMove(board);
            ptintBoard(board);
            if (hasWon(board, COMPUTER)){
                System.out.println("Computer won");
                break;
            }
            if (isDraw(board)){
                System.out.println("is Draw");
                break;
            }
        }

    }

    private static boolean isDraw(String[][] board) {
        for (int row = 0; row < SIZE; row++){
            for (int col = 0; col < SIZE; col++){
                if (board[row][col] == EMPTY){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean hasWon(String[][] board, String player) {
        // row
        for(int row = 0; row < SIZE; row++){
            if (
                board[row][0] == player
                && board[row][1] == player
                && board[row][2] == player
            ){
                return true;
            }
        }

        // col
        for(int col = 0; col < SIZE; col++){
            if (
                board[0][col] == player
                && board[1][col] == player
                && board[2][col] == player
            ){
                return true;
            }
        }

        // diag 1
        if (
                board[0][0] == player
                && board[1][1] == player
                && board[2][2] == player
        ){
            return true;
        }

        // diag 2
        if (
                board[0][2] == player
                && board[1][1] == player
                && board[2][0] == player
        ){
            return true;
        }

        return false;
    }


    private static void makeComputerMove(String[][] board) {
        Random random = new Random();
        int row;
        int col;

        do {
            row = random.nextInt(SIZE);
            col = random.nextInt(SIZE);

            System.out.println("CT: " + row + "  " + col);
        }
        while (!isEmptySell(board[row] [col]));

        board[row] [col] = COMPUTER;
    }

    private static boolean isEmptySell(String value) {
        return value.equalsIgnoreCase(EMPTY);
    }

    private static void makePlayerMove(String[][] board, Scanner sc) {
        while (true){
            System.out.println("Хід гравця - введіть рядок і стовпець (1 2):");
            String turn = sc.nextLine();
            String[] rc = turn.split(" ");

            int row = Integer.parseInt(rc[0]);
            int col = Integer.parseInt(rc[1]);

            row--;
            col--;

            if(!isInsideBoard(row, col)){
                System.out.println("Помилка: рядок і стовпець повинні бути від 1 до 3.");
                continue;
            }

            if (!isEmptySell(board[row][col])){
                System.out.println("Помилка: ця клітинка вже зайнята.");
                continue;
            }

            board[row][col] = USER;
            return;
        }

    }

    private static boolean isInsideBoard( int row, int col) {
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE;
    }

    private static String[][] createBoard() {
        String[][] board = new String[SIZE][SIZE];

        for (int row = 0; row < SIZE; row++){
            for (int col = 0; col < SIZE; col++){
                board[row][col] = EMPTY;
            }
        }
        return board;
    }

    private static void ptintBoard(String[][] board) {
        System.out.println();
        System.out.println("    1   2   3  ");
        System.out.println("  +---+---+---+");
        for (int row = 0; row < SIZE; row++) {
            System.out.print((row + 1) + " |");
            for (int column = 0; column < SIZE; column++) {
                System.out.print(" " + board[row][column] + " |");
            }
            System.out.println();
            System.out.println("  +---+---+---+");
        }
        System.out.println();
    }

}
