package lec_06.tasks;
/*
Підрахуйте, скільки чисел у діапазоні від `1` до `100` діляться на `3` без остачі.
 */
public class T7 {
    static void main() {
        int count = 0;
        int i = 1;
        int mValue = 100;

        while (i <= mValue){
            if (i % 3 == 0){
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}
