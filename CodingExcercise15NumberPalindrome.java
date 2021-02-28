package Senthil.Java;

public class CodingExcercise15NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));

    }
    public static boolean isPalindrome(int number){
        int reverse=0;
        int original=number;
        while (original != 0){

            int lastDigit=original%10;
            reverse=(reverse+lastDigit)*10;
            original=original/10;

        }
        reverse=reverse/10;
        if(number==reverse){
            return true;
        }else {
            return false;
        }
    }
}
