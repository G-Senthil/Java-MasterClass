package Senthil.Java;

public class CodingExcercise25LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }
    public static int getLargestPrime(int number){


        int i;

        if ((number <=0)||(number==1)){
            return -1;
        }else{

            for(i=2;i<=number;i++){

                        if (number%i==0){
                             number/=i;
                             i--;

                        }

            }return i;
        }
    }

}
