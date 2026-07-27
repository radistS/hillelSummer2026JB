package lec_10.ex;

import java.util.Scanner;

/*
Нарисовать треугольник
    Types of Triangles
    1.  Left
    2.  Right
    3.  Center
    Enter a number (1-3):  3
    How many rows?: 6

    #
    ##
    ###
    #### - right

       #
      ###
     #####
    ####### - center

       #
      ##
     ###
    #### - left
 */
public class Triangle {
    static void main(String[] args) {
        System.out.println(" Types of Triangles");
        System.out.println(" 1.  Left");
        System.out.println(" 2.  Center");
        System.out.println(" 3.  Right");
        System.out.println(" Enter a number (1-3):");

        Scanner scanner = new Scanner(System.in);
        int type = scanner.nextInt();
        System.out.println("How many rows?:");
        int rows = scanner.nextInt();

        if (type == 1) {
            drawLeftFor(rows);
        } else if (type == 2) {
            drawCenter(rows);
        } else if (type == 3) {
            drawRightFor(rows);
        }
    }

    private static void drawRight(int rows) {
        for (int i = 0; i < rows; ){
            System.out.println("*".repeat(++i));
        }
        System.out.println();
    }

    private static void drawCenter(int rows) {
        for (int i = 0; i < rows; ){
            System.out.println(" ".repeat(rows - ++i).concat("*".repeat(2*i - 1)));
        }
        System.out.println();
    }

    private static void drawLeft(int rows) {
        for (int i = 0; i < rows; ){
            System.out.println(" ".repeat(rows - ++i).concat("*".repeat(i)));
        }
        System.out.println();

    }
    private static void drawLeftFor(int rows) {
        for (int i = 0; i < rows; i++){
            int del = rows - i;

            for (int j = 0; j <= del; j++){
                System.out.print(" ");
            }
            for (int j = del; j <= rows; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }

    private static void drawRightFor(int rows) {
        for (int i = 0; i < rows; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
