package lec_11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    static void main() {
        List<String> al = new ArrayList<>();
        List<String> ll = new LinkedList<>();

        LinkedList<String> ll1 = new LinkedList<>();

        System.out.println(ll.getClass());
        ll.getFirst();
        ll.getLast();
    }
}
