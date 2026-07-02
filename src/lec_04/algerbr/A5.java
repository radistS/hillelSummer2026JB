package lec_04.algerbr;
/*
 Напишіть програму, яка, знаючи радіус кола, обчислює його площу (π·r²) та периметр (2·π·r).
 */
public class A5 {
    static void main(String[] args) {
        int r = 5;

        double area = Math.PI * Math.pow(r, 2);
        double perim = Math.PI * 2 * r;

        System.out.println(Math.ceil(area));
        System.out.println(Math.ceil(perim));
        System.out.println(Math.ceil(10.999f));
    }
}
