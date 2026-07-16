package lec_07.task;
/*
Знайдіть позицію першого входження слова `Java` у реченні.
Якщо слова немає, виведіть `-1`.
 */
public class T6 {
    static void main() {
        String text = "Я вивчаю Java щодня.";
        System.out.println(text.toLowerCase().indexOf("jAva".toLowerCase()));
    }
}
