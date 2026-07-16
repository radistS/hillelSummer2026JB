package lec_07.task;
/*
Видалення цифр із тексту
Перетворіть:
Java17 was released after Java11
на текст без цифр.
 */
public class T11 {
    static void main() {
        String text = "Java17 was released after Java11";
        String result = "";
        for (int i = 0; i < text.length() ; i++){
            char c = text.charAt(i);
            if (!Character.isDigit(c)){
                result += c;
            }
        }
        System.out.println(result);



        result = "";
        for (int i = 0; i < text.length() ; i++){
            char c = text.charAt(i);
            if (c < '0' || c > '9'){
                result += c;
            }
        }
        System.out.println(result);
    }
}
