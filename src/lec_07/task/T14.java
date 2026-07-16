package lec_07.task;
/*
## 42. Перетворення назви поля
Перетворіть:
user_first_name
на:
userFirstName

 */

public class T14 {
    static void main() {
        String text = "user_first_name";
        String[] nameSplit = text.split("_");
        String result = nameSplit[0];

        for (int i = 1; i < nameSplit.length;i++){
            result += nameSplit[i].substring(0, 1).toUpperCase()
                    .concat(nameSplit[i].substring(1));
        }

        System.out.println(result);

        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isAlphabetic('1'));

    }
}
