package lec_05.tasks.iflse;

/*
Оценка по баллам
Задание: Создайте программу, которая присваивает буквенную оценку
(например, A, B, C, D, F) на основе числового результата.
Подсказка: Используйте последовательность операторов if-elif-else для проверки диапазонов
(например, 90–100 для A, 80–89 для B и т.д.).

 */
public class T2 {
    static void main() {

        // 0 .. 100
        int result = 56;

        if (result >= 90 && result <= 100){ // 90 .. 100
            System.out.println("A");
        } else if (result >= 80 && result < 90){ // 80 .. 89
            System.out.println("B");
        } else if (result >= 70 && result < 80){ // 70 .. 79
            System.out.println("C");
        } else if (result >= 60 && result < 70){ // 60 .. 69
            System.out.println("D");
        } else if (result >= 0 && result < 60){ // 0 .. 69
            System.out.println("F");
        }


        if (result >=0 && result <= 100){
            if (result >= 90){ // 90 .. 100
                System.out.println("A");
            } else if (result >= 80 ){ // 80 .. 89
                System.out.println("B");
            } else if (result >= 70 ){ // 70 .. 79
                System.out.println("C");
            } else if (result >= 60 ){ // 60 .. 69
                System.out.println("D");
            } else if (result >= 0 ){ // 0 .. 69
                System.out.println("F");
            }
        } else {
            System.out.println("incorrect input data");
        }
    }
}
