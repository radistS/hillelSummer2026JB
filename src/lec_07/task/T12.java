package lec_07.task;
/*
Найдовше слово
Знайдіть найдовше слово в реченні.
Якщо найдовших слів декілька, поверніть перше.
 */
public class T12 {
    static void main() {
        String text = "Spring Boot simplifies Java development";

        String[] words = text.toLowerCase().split(" ");
        String result = words[0];

        for (int i = 1; i < words.length; i++){
            if (result.length() < words[i].length()){
                result = words[i];
            }
        }

        System.out.println(result);

        result = "";

        for (String word : words){
            if (result.length() < word.length()){
                result = word;
            }
        }
        System.out.println(result);
    }
}
