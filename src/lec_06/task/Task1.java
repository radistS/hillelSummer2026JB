package lec_06.task;

import java.sql.SQLOutput;

public class Task1 {
    public static void main(String[] args) {
        int a = 3;
        int b = a++ + ++a; // 3 + 5
        System.out.println("a: " + a);
        System.out.println("b: " + b);
//        System.out.println(a++ + ++a);
    }
}