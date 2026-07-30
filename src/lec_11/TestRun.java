package lec_11;

public class TestRun {
    static void main() {
//        Test test = new Test();
//        Test test1 = new Test();
//        Test test2 = test;
//
//        System.out.println(test.equals(test1)); // false
//        System.out.println(test.equals(test2)); // true
//
//        System.out.println(test.hashCode());
//        System.out.println(test1.hashCode());
//
//        String str = "String";

        // K, V
        Test ts = new Test();
        ts.setName("test");
        ts.setTitle("test");
        System.out.println(ts.hashCode());
        ts.setTitle("alex");
        System.out.println(ts.hashCode());
    }
}
