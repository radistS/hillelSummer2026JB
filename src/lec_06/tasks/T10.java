package lec_06.tasks;
/*
Дано масив і число для пошуку. Знайдіть перше входження числа.
 */
public class T10 {
    static void main() {
        int[] numbers = {5, 8, 3, 12, 8, 20, 7};
        int value = 80;
        int index = -1;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == value){
                index = i;
                break;
            }
        }

        if (index == -1){
            System.out.println("element not found");
        } else {
            System.out.println("element found. index : " + index);
        }
    }
}
