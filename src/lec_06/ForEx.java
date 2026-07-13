package lec_06;

public class ForEx {

    public static void main(String[] args) {
        int i = 0;
        for (print("init") ; i < 2 && print("cond"); print("increment")) {
            print("do");
            i++;
        }


        for (int j = 0; j < 5; j++){
            System.out.println(j++);
        }
    }



    private static boolean print(String str){
        System.out.println(str);
        return true;
    }

}
