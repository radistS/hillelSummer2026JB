package lec_05.tasks.arr;

import java.util.Arrays;

/*
Поиск максимального элемента в массиве.
Напишите программу для нахождения максимального значения в массиве чисел.
 */
public class A1 {
    static void main() {
        int[] mass = {1000, 2, 4, 56, 718, 12, 45, 10};
        System.out.println(Arrays.toString(mass));
        System.out.println(Arrays.toString(mass));

        int max = mass[0];

        for (int i = 1; i < mass.length; i++){
            if (mass[i] > max) {
                max = mass[i];
            }
        }

        System.out.println(max);
    }
}
