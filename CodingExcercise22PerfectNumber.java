package Senthil.Java;

public class CodingExcercise22PerfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(-1));
    }
    public static boolean isPerfectNumber(int number){
        int total=0;
        boolean s=false;
        if (number<1){
            return false;
        }else{
            for(int i=1; i<number; i++){
                if(number%i==0){
                    total=total+i;
                    if (total==number){
                        s=true;
                    }else{
                        s=false;
                    }
                }
            }
        }return s;

    }
}
