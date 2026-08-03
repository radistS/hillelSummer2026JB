package lec_12;

// Проверит является ли номер счастливым
public class LucNumber {
    static void main(String[] args) {
        System.out.println(lucNumber("123321"));
        System.out.println(lucNumber("1231321"));
        System.out.println(lucNumber("128321"));
        System.out.println(lucNumber("333009"));
        System.out.println(lucNumber("33s009"));
    }

    public static boolean lucNumber(String number){
        if (number == null || number.length() % 2 != 0){
            return false;
        }

        int left = 0;
        int right = 0;
        int middle = number.length() / 2;

        for(int i=0; i < middle; i++){
            left += number.charAt(i) - '0'; // 9 -> 39 - 30 --> 9
            right += number.charAt(i + middle) - '0';
        }

        return left == right;
    }
}
