package lec_02.view.pack1;

/**
 * Demonstrates calling public and protected methods of {@link P1C1} from the same package.
 */
public class P1C2 {

    public static void main(String[] args) {
        P1C1 cl1 = new P1C1();
        cl1.printPublic();
        cl1.printProtected();
    }
}
