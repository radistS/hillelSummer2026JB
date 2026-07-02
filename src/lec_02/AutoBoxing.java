package lec_02;

/**
 * Demonstrates autoboxing/unboxing between primitives and their wrapper types,
 * including the {@code NullPointerException} risk when unboxing a {@code null} wrapper.
 */
public class AutoBoxing {
    public static void main(String[] args) {
        int a = 10;
        Integer b = a; // autoboxing
        System.out.println(b);

        Integer c = 100;
        int d = c; // unboxing
        System.out.println(c);

        Character ch1 = 'c';
        char ch2 = ch1;
        System.out.println(ch2);

        Integer e = null; // NUllPointerException
        int f = e;
        System.out.println(f);

    }
}
