package lec_07.task;
/*
Користувач вводить ім’я файлу. Визначте, чи є він:

- Java-файлом;
- текстовим файлом; (txt)
- PDF-документом;
- файлом іншого типу.
 */
public class T4 {
    static void main() {
        String fileName = "file.exe";

        int pointIndex = fileName.indexOf(".");

        String extension = fileName.substring(pointIndex + 1);
        System.out.println(extension);

        switch (extension) {
            case "java" -> System.out.println("Java-файл");
            case "txt" -> System.out.println("текстовий файл");
            case "pdf" -> System.out.println("PDF-документ");
            default -> System.out.println(" файлом іншого типу");

        }
    }
}
