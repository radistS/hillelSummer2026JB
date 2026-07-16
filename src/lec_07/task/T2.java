package lec_07.task;
// Для заданого рядка виведіть його перший і останній символи.
public class T2 {
    static void main(String[] args) {
        String str = "Hello world";

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length() - 1));
    }
}
