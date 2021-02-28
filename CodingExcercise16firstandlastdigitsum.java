package Senthil.Java;

public class CodingExcercise16firstandlastdigitsum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(0));
    }
    public static int sumFirstAndLastDigit(int number){
        int firstdigit=0;
        int lastdigit=0;
        int original=number;
        while(original!=0){
            firstdigit=original%10;
            original=original/10;

        }
        lastdigit=number%10;
        if(firstdigit >= 0){
            return (firstdigit+lastdigit);
        }else {
            return -1;
        }

    }
}
