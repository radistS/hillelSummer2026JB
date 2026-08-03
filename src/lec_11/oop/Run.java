package lec_11.oop;

public class Run {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("bobik");
        dog.setAge(13);
        dog.setBreed("mops");


        System.out.println(dog instanceof Dog);
        System.out.println(dog instanceof Animal);

        Animal an = dog;

        System.out.println(an instanceof Cat);
        System.out.println(an instanceof Dog);

        dog.eat();

        Cat barsik;
         barsik = new Cat();

         Cat cat = barsik;

         Rabbit rabbit = new Rabbit();
        System.out.println(rabbit.getAge());
        System.out.println(rabbit.getName());
    }
}
