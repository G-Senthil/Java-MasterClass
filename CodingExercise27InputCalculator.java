package Senthil.Java;

import java.util.Scanner;

public class CodingExercise27InputCalculator {
    public static void main(String[] args) {
     inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage( ){
        int sum=0;
        long avg=0;
        int count=0;
        Scanner scanner=new Scanner(System.in);
        while(true){
            boolean hasInt=scanner.hasNextInt();
            if (hasInt){
                int number=scanner.nextInt();
                count+=1;
                sum=sum+number;

                avg=Math.round((double)(sum)/(double)(count));

            }else{
//                System.out.println("SUM=XX AVG=YY");
                break;
            }
            scanner.nextLine();
        }

        System.out.println("SUM = "+sum+" AVG = "+ avg);
        scanner.close();

  }
}
