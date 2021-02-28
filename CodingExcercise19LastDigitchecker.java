package Senthil.Java;

public class CodingExcercise19LastDigitchecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(9,99,999));
        System.out.println(isValid(1051));
    }
    public static boolean hasSameLastDigit(int a, int b, int c){
        int alastdigit=0;
        int blastdigit=0;
        int clastdigit=0;
        boolean s=false;
        if ((a>=10 && a<=1000)&& (b>=10 && b<=1000)&& (c>=10 && c<=1000)){
            alastdigit=a%10;
            blastdigit=b%10;
            clastdigit=c%10;

            if ((alastdigit==blastdigit)||(alastdigit==clastdigit)||(blastdigit==clastdigit)){
                s=true;
            }

        }else {
            s= false;
        }return s;
    }

    public static boolean isValid(int number){
        if ((number>=10) && (number<=1000)){
            return true;
        }else{
            return false;
        }
    }
}
