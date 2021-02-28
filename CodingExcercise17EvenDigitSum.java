package Senthil.Java;

public class CodingExcercise17EvenDigitSum {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(0));

    }

    public static int getEvenDigitSum (int number){
        int lastdigit=0;
        int sum=0;
        if(number >= 0){
                while (number !=0){
                    lastdigit =number%10;
                    if (lastdigit%2==0) {
                       sum +=lastdigit;
                    }
                    number /=10;
                }

        }else {
            return -1;
        }
        return sum;
    }


}
