package lec_04.module;
/*
Переведення секунд у години, хвилини та секунди

3665 секунд = 1 година 1 хвилина 5 секунд
 */

public class A6 {
    static void main() {
        int secTotal = 3665;

        int h = secTotal / 3600;
        int m = (secTotal % 3600) / 60;
        int s = secTotal % 60;

        System.out.println(secTotal + " s -> " +
                h + "H " + m + "m " + s + "s");

    }

}
