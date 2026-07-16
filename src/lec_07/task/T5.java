package lec_07.task;
// Перевірте, чи належить електронна адреса домену `company.com`.
public class T5 {
    static void main(String[] args) {
        String email = "mail@company.gov";
        String comDomain = "company.com";

        System.out.println(email.endsWith(comDomain));
    }
}
