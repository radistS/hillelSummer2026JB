package lec_06.tasks;
/*
Користувач вводить три числа. Знайдіть найбільше число.
 */
public class T2 {
    static void main(String[] args) {
        int a = 5, b = 6, c = 4;

        System.out.println("V1 >>>");
        if (a > b && a > c)
            System.out.println(a);
        else if (b > a && b > c)
            System.out.println(b);
        else
            System.out.println(c);

        System.out.println();
        System.out.println("V2 >>>");

        // a == max
        if (b > a)
                a = b;
        if (c > a)
                a = c;

        System.out.println(a);
    }
}
