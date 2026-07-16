package lec_07.task;
/*
Перетворіть рядок:
Java     is    very   popular
на:
Java is very popular
 */

public class T9 {
    static void main(String[] args) {
        String text = "Java     is    very   popular";
        System.out.println(text.replaceAll("\\s+", " "));
    }
}
