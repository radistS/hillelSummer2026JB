package lec_06.tasks;
/*
Користувач вводить ціле число. За допомогою `while` визначте кількість цифр у ньому.
Врахуйте число `0` і від’ємні числа.
 */
public class T8 {
    static void main() {
        int number = 0;
        int count = 0;

        if (number < 0){
            number = -number;
        }

        if (number == 0) {
            count = 1;
        } else {
            while (number > 0){
                number /= 10;
                count++;
            }
        }

        System.out.println(count);
    }
}
