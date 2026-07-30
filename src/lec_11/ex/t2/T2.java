package lec_11.ex.t2;

import java.util.Arrays;

/*
## 2. Тварини в зоопарку

Базовий клас: `ZooAnimal` Нащадки: `Lion`, `Elephant`, `Monkey`,
`Penguin` Створити клас `Zoo`, який зберігає список тварин та підраховує
добову кількість корму.
 */
public class T2 {
    static void main(String[] args) {
        ZooAnimal[] animals = new ZooAnimal[10];

        animals[0] = new Elephant(100, 12);
        animals[1] = new Lion(80, 60);
        animals[2] = new Monkey(15, 44);
        animals[3] = new Penguin(55, 125);

        System.out.println(Arrays.toString(animals));

        System.out.println(new Zoo().calculateTotalweigth(animals));
        System.out.println(new Zoo().calculateTotalPrice(animals));

    }
}
