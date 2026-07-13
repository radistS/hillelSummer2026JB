package lec_06.tasks;
/*
Користувач вводить номер місяця. За допомогою `switch` визначте пору року:

- зима;
- весна;
- літо;
- осінь.
 */
public class T5 {
    static void main() {
        int mNumber = 8;
        switch (mNumber) {
            case 1, 2, 12 -> System.out.println("зима");
            case 3, 4, 5 -> System.out.println("весна");
            case 6, 7, 8 -> System.out.println("літо");
            case 9, 10, 11 -> System.out.println("осінь");
            default -> System.out.println("error");
        }
    }
}
