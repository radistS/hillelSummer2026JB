package lec_07.task;
// Для імені файлу знайдіть позицію останньої крапки.
public class T7 {
    static void main() {
        String file = "report.final.version.pdf";

        System.out.println(file.indexOf("."));
        System.out.println(file.lastIndexOf("."));
    }
}
