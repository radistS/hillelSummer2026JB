package lec_04.module;
/*
Напишіть програму, яка обчислює суму цифр тризначного числа,
 */
public class A3 {
    static void main() {
        int number =  222;
        int od = number % 10;
        number /= 10;
        int sot = number % 10;
        number /= 10;
        int tis = number % 10;
        System.out.println(od + sot + tis);

    }
}
