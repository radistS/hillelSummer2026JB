package lec_04;

public class LogOperations {
    static void main() {
        boolean v = true;
        boolean w = false;

        System.out.println(v);
        System.out.println(!v);

        System.out.println(v == w);
        System.out.println(v != w);

        System.out.println(v == !w);

        /*

        AND
        A B R
        t f f
        f f f
        f t f
        t t t

        OR
        A B R
        t f t
        f f f
        f t t
        t t t


         */

        int a = 5;
        int b = 6;
        int c = 7;

        System.out.println(++a + b * c);
    }
}
