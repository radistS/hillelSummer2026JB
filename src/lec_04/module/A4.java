package lec_04.module;
/*
   Напишіть програму, яка приймає загальну кількість предметів і обчислює, скільки коробок можна заповнити,
   якщо в кожну коробку вміщається 8 предметів.
 */
public class A4 {
    static void main() {
        int items = 36;
        int fullBox = items / 8;
        int addBox = items % 8 != 0 ? 1 : 0;
        int totalBox = fullBox + addBox;
        System.out.println(totalBox);


    }
}
