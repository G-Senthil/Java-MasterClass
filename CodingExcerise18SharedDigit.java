package Senthil.Java;

public class CodingExcerise18SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(15,55));
    }
    public static boolean hasSharedDigit(int firstnumber, int secondnumber){
        int lastdigitfirstnumber=0;
        int firstdigitfirstnumber=0;
        int lastdigitsecondnumber=0;
        int firstdigitsecondnumber=0;
        boolean s=false;
        if ((firstnumber >=10)&&(firstnumber <=99)&&(secondnumber>=10)&&(secondnumber<=99)){
            lastdigitfirstnumber=firstnumber%10;
            firstnumber /=10;
            firstdigitfirstnumber=firstnumber%10;

            lastdigitsecondnumber=secondnumber%10;
            secondnumber /=10;
            firstdigitsecondnumber=secondnumber%10;

            if ((lastdigitfirstnumber==lastdigitsecondnumber)|| (lastdigitfirstnumber==firstdigitsecondnumber)||(firstdigitfirstnumber==lastdigitsecondnumber)||  (firstdigitfirstnumber==firstdigitsecondnumber)){
                s= true;
            }else {
                s= false;
            }
        } return s;

    }
}
