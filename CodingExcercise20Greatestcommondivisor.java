package Senthil.Java;

public class CodingExcercise20Greatestcommondivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(1010, 10));
    }

    public static int getGreatestCommonDivisor(int a, int b) {
        int greatestnumber = 0;
        if ((a >= 10) && (b >= 10)) {
            if (a < b) {
                for (int i = 1; i <=a; i++) {
                    if ((a % i == 0) && (b %i==0)) {
                        greatestnumber = i;
                    }
                }
            } else {
                for (int l = 1; l <= b; l++) {
                    if ((b % l == 0) && (a %l==0)){
                        greatestnumber = l;
                    }
                }

            }
        } else {
            greatestnumber=-1;

        }
        return greatestnumber;

    }
}


