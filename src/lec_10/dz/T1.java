package lec_10.dz;

public class T1 {
    // Напишіть метод, який приймає ціле число як аргумент і виводить його квадрат.
    public int calSq(int n){
        return n * n;
    }

    // Квадрат числа 5 дорівнює 25.
    public void print(int n, int result){
        System.out.printf("Квадрат числа %s дорівнює %s. %n", n, result);
    }

    public void print(int n){
        System.out.printf("Квадрат числа %s дорівнює %s. %n", n, calSq(n));
    }

}
