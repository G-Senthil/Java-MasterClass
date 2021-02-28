package Senthil.Java;

public class SpeedConvertor {

    public static void main(String[] args) {

        printconversion(10.5);
    }

    public static long tomilesperhour(double kilometerperhour) {

        if (kilometerperhour < 0) {
            return -1;

        } else {

            return Math.round(kilometerperhour / 1.609);
        }

    }

    public static void printconversion(double kilometerperhour){

        if (kilometerperhour < 0){
            System.out.println("Invalid value");
        } else{
            long milesperhour=tomilesperhour(kilometerperhour);
            System.out.println(kilometerperhour + " kmph    " + milesperhour + " mph");
        }
    }
}