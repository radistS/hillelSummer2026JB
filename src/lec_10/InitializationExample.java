package lec_10;

public class InitializationExample {

    // Static field
    private static String staticField = initStaticField();

    // Static initialization block
    static {
        System.out.println("2. Static block");
    }

    // Instance field
    private String instanceField = initInstanceField();

    // Instance initialization block
    {
        System.out.println("4. Instance block");
    }

    // Constructor
    public InitializationExample() {
        System.out.println("5. Constructor");
    }

    // Helper methods
    private static String initStaticField() {
        System.out.println("1. Static field");
        return "STATIC";
    }

    private String initInstanceField() {
        System.out.println("3. Instance field");
        return "INSTANCE";
    }

    public static void main(String[] args) {

        System.out.println("Program started\n");

        System.out.println("Creating first object...");
        new InitializationExample();

        System.out.println("\nCreating second object...");
        new InitializationExample();
    }
}
