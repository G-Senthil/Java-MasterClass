package Senthil.Java;

public class equalsum {

    public static void main(String[] args) {

        boolean answer = hasEqualSum(-1,2,3);
        System.out.println(answer);

    }
    public static boolean hasEqualSum(int a, int b, int c){
        int sum=(a+b);
        if (sum==c){
            return true;
        }else {
            return false;
        }

    }
}
