package lec_05.tasks.loop;
/*
Вывод чётных чисел от 2 до 20.
Используя цикл for, выведите все чётные числа в диапазоне от 2 до 20.
 */
public class L2 {
    static void main(String[] args) {
        for (int i = 2; i < 21; i++){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 2; i < 21; i += 2){
                System.out.print(i + " ");
        }
    }
}
