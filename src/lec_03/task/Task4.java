package lec_03.task;

/**
 * Demonstrates the {@link Integer} cache: boxed values in [-128, 127] share identity via
 * {@code ==}, while values outside that range do not; {@code equals} is always value-based.
 * Also shows the same caching behavior for {@link Short}.
 */
public class Task4 {
    public static void main(String[] args) {
        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b);
        System.out.println(a.equals(b));

        Integer c = 256;
        Integer d = 256;
        System.out.println(c == d);
        System.out.println(c.equals(d));

        Short a1 = 127;
        Short b2 = 127;
        System.out.println(a1 == b2);
    }
}
