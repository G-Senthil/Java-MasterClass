package Senthil.Java;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;

public class switchcase {
    public static void main(String[] args) {
        int c=1;
        switch (c){
            case 1:
                System.out.println(1);
                break;

            case 2:
                System.out.println(2);
                break;

            default:
                System.out.println("default");
                break;

        }

        char charvalue='z';
        switch(charvalue){
            case 'A':
                System.out.println("A");
                break;
            case 'B': case 'C': case 'D': case 'E': case'V':
                System.out.println("B");
                break;

            default:
                System.out.println("");
        }

        String month="JANUARY";

        switch (month.toLowerCase( )){
            case "january":
                System.out.println("jam");
                break;
            case "february":
                System.out.println("feb");

            default:
                System.out.println("default");
                break;
        }
    }
}
