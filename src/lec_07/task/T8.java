package lec_07.task;
/*
Користувач вводить ім’я із зайвими пробілами на початку та в кінці.
Поверніть очищене значення.
 */
public class T8 {
    static void main(String[] args) {
        String str = "   aaa bbb    ";
        System.out.println(str.trim());

        int start  = 0;
        int end = str.length() - 1;

        while (start <= end && str.charAt(start) == ' '){
            start++;
        }

        while (end >= start && str.charAt(end) == ' '){
            end--;
        }

        System.out.println(str.substring(start, end + 1));
    }
}
