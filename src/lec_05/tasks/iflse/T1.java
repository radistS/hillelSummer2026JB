package lec_05.tasks.iflse;

/*
Положительное, отрицательное или ноль
Задание: Напишите программу, которая считывает целое число и выводит, является ли число положительным,
отрицательным или нулём.
Подсказка: Используйте операторы if, elif/else для сравнения числа с 0.
 */
public class T1 {
    static void main() {
        int a = -12;

        // positive, negative, zero
        if (a > 0){
            System.out.println("positive");
        } else if (a == 0) {
            System.out.println("zero");
        } else {
            System.out.println("negative");
        }
    }
}
