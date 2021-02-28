package Senthil.Java;

public class leapyear {

    public static void main(String[] args) {
        boolean result=isLeapYear(0);
        System.out.println(result);
    }

    public static boolean isLeapYear(int year){
        boolean s=false;
        if (year >=1 && year <=9999){

            if(year%4==0){
                if(year%100==0){
                    if(year%400==0){
                        s=true;
                    }else s=false;
                }else s=true;
            }else s=false;

        }else{
            s=false;
        }return s;
    }
}
