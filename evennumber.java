package Senthil.Java;

public class evennumber {
    public static void main(String[] args) {

        int number=4;
        int finishNumber=20;
        int count=0;
        while(number<=finishNumber){
            number++;

            if(!isEvenNumber(number)){
                continue;
            }
            count=count+1;
            System.out.println("Even number is " + number);
            if (count==5){
                System.out.println("Count is " + count);
                break;
            }


        }


    }
    public static boolean isEvenNumber(int number){
        if((number%2==0)){
            return true;
        }else {
            return false;
        }
    }
}
