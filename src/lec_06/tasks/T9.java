package lec_06.tasks;
/*
Виведіть числа від `1` до `30`, пропускаючи числа, які діляться на `3`.
 */
public class T9 {
    static void main() {
        int i = 1;
        while (i <= 30){
            if (i % 3 == 0){
                i++;
                continue;
            }
            System.out.print(i++ + " ");
        }
    }
}
