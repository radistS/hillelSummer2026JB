package lec_07.task;
/*
Для рядка:
Ivan Ivanov Petrovich
отримайте:
Ivanov I. P.
 */
public class T13 {
    static void main() {
        String name = "Ivan Ivanov Petrovich";

        String[] nameSplit = name.split(" ");

        String pib = nameSplit[1] + " "
                + nameSplit[0].charAt(0) +". "
                + nameSplit[2].charAt(0) +".";

        System.out.println(pib);
    }
}
