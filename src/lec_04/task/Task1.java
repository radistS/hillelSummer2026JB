package lec_04.task;

/**
 * Demonstrates byte overflow when narrowing an {@code int} to a {@code byte} via a cast.
 */
public class Task1 {
    public static void main(String[] args) {
        int a = 256;
        byte b = (byte) a;
        System.out.println(b);
    }
}
