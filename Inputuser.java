package Senthil.Java;

import java.util.Scanner;

public class Inputuser {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println(" Enter your age355 :");
        boolean hasInt=scanner.hasNextInt();
        if(hasInt){
            int currentYear=scanner.nextInt();
            scanner.nextLine();
            System.out.println(" Enter your name :");
            String name=scanner.nextLine();
            int age=2021-currentYear;

            if (age>0 && age < 150){
                System.out.println(" your name is "+ name + " and your age is "+ age);
            }else {
                System.out.println("Invalid input");
            }

        }else {
            System.out.println("Invalid entry34");
        }



        scanner.close();
    }

}
