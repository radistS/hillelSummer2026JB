package lec_04.task;

/**
 * Demonstrates that a literal exceeding {@code int} range must use the {@code long} type
 * (and the {@code L} suffix, or an in-range value as shown here) to compile.
 */
public class Task4 {
    public static void main(String[] args) {
        long bigNumber = 2_147_483_648L;
//        long bigNumber = 2_147_483_647;
        System.out.println(bigNumber);
    }
}
