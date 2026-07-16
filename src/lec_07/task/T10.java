package lec_07.task;
/*
Маскування банківської картки 1234567812345678 >>> ************5678
 */
public class T10 {
    static void main() {
        String cardNumber = "1234567812345678";
        String result = "";

        for (int i = 0; i < cardNumber.length() -4; i++){
            result +="*";
        }
        result += cardNumber.substring(cardNumber.length()-4);
        System.out.println(result);

    }
}
