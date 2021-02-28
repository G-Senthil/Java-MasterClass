package Senthil.Java;

public class stringtonumber {
    public static void main(String[] args) {
        String numberstring="2018";
        System.out.println(" This is string " + numberstring);
        int number=Integer.parseInt(numberstring);
        System.out.println("This is convrte number string "+ number);

        numberstring +=1;
        number +=1;
        System.out.println(numberstring);
        System.out.println(number);
        String nstring="2018.5656";
        double dn=Double.parseDouble(nstring);
        dn+=1;
        System.out.println(dn);


    }
}
