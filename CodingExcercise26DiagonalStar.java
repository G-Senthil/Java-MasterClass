package Senthil.Java;

public class CodingExcercise26DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);

    }

    public static void printSquareStar(int number){

        int row=number;
        int column=number;
        if (number < 5){
            System.out.println("Invalid Value");
        }else {
            for(int i=1; i<=row;i++){
                System.out.println();
                for(int j=1; j<=column;j++){

                    if(( i==1 || i==row)|| (j==1 || j==column) || (i==j)||(j==row-i+1)){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
        }
    }

}
