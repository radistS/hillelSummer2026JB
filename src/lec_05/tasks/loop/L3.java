package lec_05.tasks.loop;
/*
Напишите программу, которая находит сумму чисел от 1 до заданного N.

 */
public class L3 {
    static void main() {
        int number = 5;

        int result = 0;

        for (int i = 1; i <= number; i++){
            result += i;
        }
        System.out.println(result);
    }
}
