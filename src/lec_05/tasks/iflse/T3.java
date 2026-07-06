package lec_05.tasks.iflse;
/*
Расчет стоимости билета
Задание: Напишите программу, которая рассчитывает стоимость билета в кинотеатр в зависимости от возраста
посетителя. Например, детям (до 12 лет) и пожилым людям (старше 65 лет) может предоставляться скидка, а остальные оплачивают полную стоимость.
Подсказка: Используйте серию операторов if-else для определения соответствующей возрастной категории и расчёта цены.
 */
public class T3 {
    static void main(String[] args) {
        int saleC = 25;
        int saleA = 30;

        double price = 14.55;
        int age = 10;

        double totalPrice = 0;
        double priceA = price - (price * saleA / 100);
        double priceC = price - (price * saleC / 100);

        if (age < 16) {
            System.out.println(priceC);
        } else if (age > 65) {
            System.out.println(priceA);
        } else {
            System.out.println(price);
        }

        if (age < 16) {
            System.out.println(price - (price * saleC / 100));
        } else if (age > 65) {
            System.out.println(price - (price * saleA / 100));
        } else {
            System.out.println(price);
        }

        // 3 oper  - 10000 >>> 30000
        // 1 opr - 10000 >>> 10000
    }
}

// 10
// 5 - 14.55
// 5 - 12.00
