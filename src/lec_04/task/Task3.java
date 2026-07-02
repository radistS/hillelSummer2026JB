package lec_04.task;

/**
 * Demonstrates the difference between reference equality ({@code ==}) and value equality
 * ({@code equals}) for boxed {@link Double} instances created via the constructor.
 */
public class Task3 {
    public static void main(String[] args) {
        Double a = new Double(1.0);
        Double b = new Double(1.0);
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
