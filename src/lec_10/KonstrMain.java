package lec_10;

public class KonstrMain {
    public static void main(String[] args) {
       Konstr k = new Konstr();

       k.printParam();
       k.a = 10;
       k.b = 20;
       k.printParam();

       Konstr k1 = new Konstr(2, 3);
       k1.printParam();
       Konstr k2 = new Konstr(2);
       k2.printParam();

    }
}
