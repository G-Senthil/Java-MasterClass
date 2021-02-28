package Senthil.Java;

import java.util.Scanner;

public class ChallengeReadInput {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the 10 numbers");
        boolean hasInt=scanner.hasNextInt();
        if(hasInt){
            for(int i=1; i<=10; i++){
                a=scanner.nextInt();
                b=b+a;
            }

        }else{
            System.out.println("Enter the correct");
        }
        System.out.println("The sum of 10 Numbers" + b);
        scanner.close();
    }
}
