package lec_04;

/**
 * Demonstrates increment/decrement and compound assignment operators.
 */
public class Incre {
    public static void main(String[] args) {

        int a = 5;
        System.out.println(a++); // a++ -> a = a + 1
        System.out.println(a);

        int b = 5;
        System.out.println(b--); // a-- -> a = a - 1
        System.out.println(b);

        int c  = 5;
        System.out.println(--c); // 4
        System.out.println(++c); // 5


        a += 10; // a = a + 10;
        System.out.println(a);
        a -= 10; // a = a - 10;
        System.out.println(a);
        a *= 5; // a = a * 5;
        System.out.println(a);
        a /= 5; // a = a / 5;
        System.out.println(a);
    }
}
