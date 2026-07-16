package lec_07.task;
// Користувач вводить ім’я. Якщо воно довше за 10 символів, залиште лише перші 10 символів і додайте ...
public class T3 {
    static void main(String[] args) {
        String str = "Hello world - 2026";

        if (str.length() > 10){
            str = str.substring(0, 10).concat("...");
        }

        System.out.println("result >>> " + str);
    }
}
