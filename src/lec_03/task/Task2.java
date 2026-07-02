package lec_03.task;

/**
 * Demonstrates truncation when narrowing a {@code double} to an {@code int} via a cast.
 */
public class Task2 {
    public static void main(String[] args) {
        double a = 9.7;
        int b = (int) a;
        System.out.println(b);
    }
}
