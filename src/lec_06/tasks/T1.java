package lec_06.tasks;
/*
Додатне, від’ємне або нуль
 */
public class T1 {
    static void main() {
        int a = 5;
        int res = compare(a);
        switch ( res){
            case 1 -> System.out.println("Додатне");
            case -1 -> System.out.println("Від’ємне");
            default -> System.out.println("0");
        }

    }

    private static int compare(int a) {
        return a < 0 ? -1 : 1;
    }
}
