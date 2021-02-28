package Senthil.Java;

import java.util.Scanner;

public class ChallengeMinimumandMaximum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

//
//        int min=0;
//        int max=0;
//        boolean firstFlag=true;
           // other options
           int min=Integer.MAX_VALUE;
                   int max=-2147483647;

            while (true){
                System.out.println("Enter the number:");
                boolean hasInt=scanner.hasNextInt();


                if(hasInt){
                    int number=scanner.nextInt();
//                    if (firstFlag){
//                        min=number;
//                        max=number;
//                        firstFlag=false;
//                    }
                    if (number< min){
                         min=number;

                       }else if (number > min){
                        max=number;
                     }
                }
                 else{
                    System.out.println("Invalid Input");
                     break;
               }
             scanner.nextLine();
            }
        System.out.println("The minimum number is "+ min + " The Maximum number is " + max);
        scanner.close();
    }

}
