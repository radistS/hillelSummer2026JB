package lec_04;

//     Напишіть програму, що демонструє, як використання скорочених операторів скорочує код порівняно зі звичайним записом (наприклад, i = i + 1 vs. i++ або i += 1).

/**
 * Demonstrates shorthand increment operators versus the equivalent verbose assignment.
 */
public class IncrExample {

    public static void main(String[] args) {

    }

    /**
     * Returns the given value and then increments it (post-increment).
     *
     * @param value the value to increment
     * @return the value before incrementing
     */
    public static int increment1(int value){
//        value = value + 1;
//        value++;
//        value +=1;
        return value++;
    }

}
