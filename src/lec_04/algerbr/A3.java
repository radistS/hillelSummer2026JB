package lec_04.algerbr;
/*
   Напишіть програму для конвертації температури з градусів Цельсія у Фаренгейти за формулою:
   F = (9/5) * C + 32.
 */
public class A3 {
    static void main(String[] args) {
        int c = 39;
        System.out.println("C = " + c);
        double f = ((double) (9 * c) / 5) + 32;
        System.out.println("F = " + f);
    }
}
