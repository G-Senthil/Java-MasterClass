package Senthil.Java;

public class teenclass {

    public static void main(String[] args) {
        boolean answer=hasTeen(18,2,10);
        System.out.println(answer);
        boolean answer2=isTeen(19);
        System.out.println(answer2);

    }
    public static boolean hasTeen(int a, int b, int c){

        if ((a>=13 && a<=19)||(b>=13 && b<=19)||(c>=13 && c<=19)){
            return true;

        }else {
            return false;
        }
    }
    public static boolean isTeen(int s){

        if (s>=13 && s<=19){
            return true;

        }else {
            return false;
        }
    }

}
