package Senthil.Java;

public class minutestoyears {
    public static void main(String[] args) {
        printYearsAndDays(-525600);

    }
    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hour = minutes / 60;
            long dd = hour / 24;
            long years = dd / 365;
            long days = dd % 365;
            System.out.println(minutes + " min = " + years + " y" + " and " + days + " d");
        }
    }
}
