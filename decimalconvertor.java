package Senthil.Java;

public class decimalconvertor {

    public static void main(String[] args) {
       boolean answer= areEqualByThreeDecimalPlaces(-3.1756,-3.175);
        System.out.println(answer);

    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        int number1=(int)(a*1000);
        int number2=(int)(b*1000);
        if (number1==number2){
            return true;

        }else return false;


    }


}
