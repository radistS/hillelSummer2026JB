package lec_05.tasks.loop;
/*
С помощью вложенных циклов for выведите таблицу умножения для чисел от 1 до 10.
 */
public class L4 {
    static void main() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("─── Table of " + i + " ───");
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%2d x %2d = %3d%n", i, j, i * j);
            }
            System.out.println();
        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%2d x %2d = %3d   ", i, j, i * j);
            }
            System.out.println(); // move to next row after each table
        }
    }
}
