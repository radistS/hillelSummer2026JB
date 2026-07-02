package lec_02.view.pack2;

import lec_02.view.pack1.P1C1;

/**
 * Extends {@link P1C1} from a different package, overriding its protected method.
 */
public class P2C2 extends P1C1 {
    /**
     * Prints a message, then calls the overridden superclass implementation.
     */
    @Override
    protected void printProtected() {
        System.out.println("Protected - c2p2");
        super.printProtected();

    }
}
