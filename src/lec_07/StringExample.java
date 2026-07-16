package lec_07;

public class StringExample {
    public static void main(String[] args) {
        String str = "Hello"; // addr 1
        str += "hi";          // addr 2

        String s = new String(new char[]{'a', 'b'});
        System.out.println(s);

        int a = 10;
        a++;
        a++;
        a++;
        System.out.println(a);
        str = "Hello";
        System.out.println(str); // -> new object
        str = str.toLowerCase(); // -> new object
        System.out.println(str);
    }
}
