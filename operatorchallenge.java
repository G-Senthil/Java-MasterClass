package Senthil.Java;

public class operatorchallenge {
    public static void main(String[] arg){
        double a=20.00d;
        double b=80.00d;
        double c=(a+b)*100.00;
        double d=c%40.00;

        System.out.println("c is :"+ c);
        System.out.println("d is :"+ d);
        boolean r= (d==0) ? true : false;
        System.out.println(r);
        if(!r){
            System.out.println("Got Some Reminder");
        }


    }
}
