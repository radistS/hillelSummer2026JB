package lec_02.view.pack1;

/**
 * Demonstrates public, protected, and private access modifiers on methods.
 */
public class P1C1 {
    /**
     * Prints a message; callable from any package.
     */
    public void printPublic(){
        System.out.println("PrintPublic - p1c1");
    }

    /**
     * Prints a message; callable from the same package or subclasses, then delegates
     * to the private {@code printPrivate} method.
     */
    protected void printProtected(){
        System.out.println("PrintProtected - p1c1");

        printPrivate();
    }

    private void printPrivate(){
        System.out.println("PrintPrivate p1c1");
    }
}
