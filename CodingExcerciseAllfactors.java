package Senthil.Java;

public class CodingExcerciseAllfactors {
    public static void main(String[] args) {
        printFactors(100);

    }

    public static void printFactors(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }else{

            for (int i=1;i<=number;i++){
                if (number%i==0){
                    System.out.println(i);
                }

            }

        }

    }
}
