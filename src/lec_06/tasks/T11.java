package lec_06.tasks;
/*
5!
 */
public class T11 {
    static void main() {
        int value = 5;
        int result = 1;

        for (int i = 2; i <= value; i++){
            result *= i;
        }

        System.out.println(result);
    }
}
