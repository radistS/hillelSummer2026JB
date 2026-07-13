package lec_06.tasks;
/*
Користувач вводить довжини трьох сторін. Визначте, чи може існувати трикутник із такими сторонами.
 */
public class T3 {
    static void main() {
        int a = 3;
        int b = 4;
        int c = 5;

        // a + b > c
        // c + b > a
        // a + c > b

        if (a + b > c && b + c > a && a + c > b){
            System.out.println("Could create tr");
        } else {
            System.out.println("Could not create tr");
        }

    }
}
