package lec_10.ex;

import lec_04.algerbr.A1;

import java.util.Arrays;

/*
 Заполнить массив N числами последовательности Фибоначчи
 F(n) = F(n - 1) + F(n - 2) //F(0) = 0; F(1) = 1;
 */
public class Fibonacci {
    public static void main(String[] args) {
        fibonacciArray(16);
        System.out.println(fibonacciRec(15));
        System.out.println(fibonacci(15));

    }

    private static int fibonacciRec(int n ) {
        if (n == 0){
            return 0;
        }

        if (n == 1){
            return 1;
        }

        return fibonacciRec(n - 2) + fibonacciRec(n - 1);
    }

    private static void fibonacciArray(int n) {
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for(int i = 2; i < fibonacci .length; i++){
            fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
        }
        System.out.println(Arrays.toString(fibonacci));
    }

    private static int fibonacci(int n) {
        int first = 0;
        int second = 1;
        int next = 0;

        for(int i = 2; i <= n ; i++){
           next = first + second;
           first = second;
           second = next;
        }

        return next;
    }
}
