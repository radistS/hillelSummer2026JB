package lec_05.tasks.arr;

import java.util.Arrays;

/*
Поиск индекса заданного элемента.
Реализуйте программу, которая принимает число и выводит индекс его первого вхождения
 в массив. Если число не найдено, выведите соответствующее сообщение.

 */
public class A2 {
    static void main() {
        int[] mass = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(mass));

        int elm = 3;
        int index = -1;

        for (int i = 0; i < mass.length; i++){
            if (mass[i] == elm) {
                index = i;
            }
        }

       if (index != -1){
           System.out.println("index of element " + elm + " >>> " + index);
       } else {
           System.out.println("element does not present in array");
       }

    }
}
