package lec_11.oop;

// Boolean -> true.null.false >>> null >> get...
// boolean -> true.false >>> false >> is...
public class Cat extends Animal{
    private boolean hat;
    private boolean tie;

    public boolean isHat() {
        return hat;
    } //get...

    public void setHat(boolean hat) {
        this.hat = hat;
    }

    public boolean isTie() {
        return tie;
    } //get...

    public void setTie(boolean tie) {
        this.tie = tie;
    }
}
