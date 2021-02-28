package Senthil.Java;

public class numberofdaysinmonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, -2018));
    }

    public static boolean isLeapYear(int year) {
        boolean s = false;
        if ((year > 1) && (year < 9999)) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        s = true;
                    } else s = false;
                } else s = true;
            } else s = false;

        } else {
            s = false;
        }
        return s;
    }

    public static int getDaysInMonth(int month, int year) {
        int s=0;
        if ((month < 1) || (month > 12)) {
            return -1;
        } else if ((year < 1) || (year > 9999)) {
            return -1;
        } else {

            switch (month) {
                case 1:
                    s= 31;
                break;
                case 2:
                    if (isLeapYear(year)) {
                        s= 29;
                    } else {
                        s=28;
                    }
                    break;
                case 3:
                    s=31;
                break;
                case 4:
                    s= 30;
                break;
                case 5:
                    s=31;
                break;
                case 6:
                    s= 30;
                break;
                case 7:
                    s= 31;
                break;
                case 8:
                    s=31;
                break;
                case 9:
                    s=30;
                break;
                case 10:
                    s= 31;
                break;
                case 11:
                    s= 30;
                break;
                case 12:
                    s= 31;
                break;
            }
        }return s;
    }
}
