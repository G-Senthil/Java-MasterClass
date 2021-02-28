package Senthil.Java;

public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(20201));
    }
    public static int sumDigits(int number) {

        int sum=0;
        if ((number < 10)) {

                 return -1;
        }

        while (number > 0){
            int digit=number%10;
            sum=sum+digit;
            System.out.println("from Digit" + digit);
            number=number/10;
            System.out.println("from Number division" + number);
        }return (sum);
    }
}
