package lec_06.tasks;
/*
Обчисліть суму всіх парних чисел від `1` до `100`. while()
 */
public class T6 {
    static void main() {
        int summ = 0;
        int i = 1;
        int maxValue = 100;

        while (i <= maxValue){
            if (i % 2 == 0) {
                summ += i;
            }
            i++;
        }
        System.out.println(summ);

    }
}
