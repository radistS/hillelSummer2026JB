package lec_02;

/**
 * Demonstrates valid Java identifier styles: non-ASCII names, camelCase, and
 * identifiers starting with {@code _} or {@code $}.
 */
public class NameExample {
    // english names + camelCase
    public static void main(String[] args) {
        печать();
        print_test();
        printTest();
    }

    /**
     * Prints a message using a Cyrillic (non-ASCII) method name.
     */
    public static void печать() {
        System.out.println("метод печать");
    } // utf8 coding

    /**
     * Declares local variables using unconventional but valid identifier names.
     */
    public static void test1() {

//        int 1a = 2;
        int _1 = 2;
        int $1 = 2;
        int a1 = 2;
    }

    /**
     * Method name starting with an underscore, a valid Java identifier.
     */
    public static void _test() {
    }

    /**
     * Method name starting with a dollar sign, a valid Java identifier.
     */
    public static void $test() {

    }

    /**
     * Prints a message using a snake_case method name.
     */
    public static void print_test() {
        System.out.println("print_test");
    }

    /**
     * Prints a message using a camelCase method name.
     */
    public static void printTest() {
        System.out.println("printVoid");
    }
}
