package Senthil.Java;

public class barkiingdof {
    public static void main(String[] args) {
        boolean answer = shouldWakeUp(true, 9);
        System.out.println(answer);

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean s = false;
        if (barking) {

            if ((hourOfDay >=0 && hourOfDay <= 23) && (hourOfDay > 22 || hourOfDay < 8)) {
                s = true;
            } else {
                s = false;
            }

        }return s;

    }
}
