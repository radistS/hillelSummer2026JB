package lec_10.constr;

public class User {
    int age;
    String name;

    public User() {
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public User(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public User(int age) {
        this.age = age;
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
