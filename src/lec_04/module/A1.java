package lec_04.module;
/*
   Напишіть програму, яка приймає загальну кількість яєць і виводить кількість повних десятків яєць
   (наприклад, 47 яєць → 4 повних десятка).
 */
public class A1 {
    static void main() {
        int eggs = 47;
        eggs /= 10;
        System.out.println(eggs);

        int mod10 = eggs % 10;
        System.out.println(mod10);
    }
}
