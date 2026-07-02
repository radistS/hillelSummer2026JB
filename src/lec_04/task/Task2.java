package lec_04.task;

/**
 * Demonstrates that truncating two distinct doubles to {@code int} can make them compare equal.
 */
public class Task2 {
    public static void main(String[] args) {
        double a = 100.0;
        double b = 100.5;
        System.out.println((int) a == (int) b);
    }
}
