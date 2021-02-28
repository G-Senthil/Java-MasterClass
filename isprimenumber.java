package Senthil.Java;

public class isprimenumber {
    public static void main(String[] args) {
        int count=0;
        for (int i=1;i<15;i++){

            if(isPrime(i)){
//                System.out.println(isPrime(i));
                count+=1;
                if (count==3){
                    System.out.println("Reached count 3");
                    break;
                }
            }
        }
        System.out.println(count);
        }

    public static boolean isPrime(int n){
        if (n==1){
            return false;
        }

        for (int i=2;i<=n/2;i++){
            if (n%i==0){
                return false;
            }


        }
        System.out.println("The prime number is " + n);
        return true;
    }
}
