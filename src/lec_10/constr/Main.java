package lec_10.constr;

public class Main {
    static void main(String[] args) {
        User user = new User();

        User us = new User(40, "Oleksandr");
        User us1 = new User(40);
        User us2 = new User("Oleksandr");

        System.out.println(user);
    }
}
