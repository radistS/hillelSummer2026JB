package lec_02;

/**
 * Demonstrates variable declaration styles: single, multiple, and {@code var} type inference.
 */
public class Variables {
    public static void main(String[] args) {
        int k;
//        System.out.println(k);
        k = 10;
        System.out.println(k);

        int n = 10;
        System.out.println(n);


        int a = 2, b = 3, c = 11;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        var val = 10;
        System.out.println(val);
        
        String text = "text";
        System.out.println(text + text);
        System.out.println(text + " " + text);
    }
}
