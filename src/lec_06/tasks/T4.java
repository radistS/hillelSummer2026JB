package lec_06.tasks;
/*
Користувач вводить три сторони трикутника. Якщо трикутник існує, визначте його тип:

- рівносторонній;
- рівнобедрений;
- різносторонній.

 */
public class T4 {
    static void main() {
        int a = 3;
        int b = 3;
        int c = 2;

        // a + b > c
        // c + b > a
        // a + c > b

        // рівносторонній >> a == b and b == c >> a == c
        // рівнобедрений >> a == b or a == c or c == b
        // різносторонній >> all other

        if (a + b < c || b + c < a || a + c < b){
            System.out.println("Could not create tr");
        } else if (a == b && b == c){
            System.out.println("рівносторонній");
        } else if (a == b || b == c || c ==a ) {
            System.out.println("рівнобедрений");
        } else {
            System.out.println("різносторонній");
        }
    }
}
