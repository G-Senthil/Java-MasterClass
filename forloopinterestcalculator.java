package Senthil.Java;

public class forloopinterestcalculator {
    public static void main(String[] args) {
//        for (int i = 0; i < 25; i++) {
//            interestcalculator(10000, i);
//        }
     loopback1();

    }

    public static void interestcalculator(double amount, double interest) {

        System.out.println(String.format("%.2f",(amount * interest / 100)));


    }

    public static void loopback1(){
        for(int i=8;i>=1;i--){
            System.out.println(i);
        }
    }
}
