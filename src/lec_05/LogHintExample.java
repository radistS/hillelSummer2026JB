package lec_05;

public class LogHintExample {
    static void main() {
        System.out.println("res: " + (tr() || fls())); // T + OR >>> T (F + F >> F)
        System.out.println("--------");
        System.out.println("res: " + (tr() | fls())); // T + OR + T >>> T
    }

    public static boolean tr(){
        System.out.println("func >> true");
        return true;
    }

    public static boolean fls(){
        System.out.println("func >> false");
        return false;
    }
}
