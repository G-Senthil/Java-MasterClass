package Senthil.Java;

public class CodingExcercise23NumberToWord {
    public static void main(String[] args) {
//        System.out.println(numberToWords(1010));
        System.out.println(getDigitCount(0));
//        System.out.println(reverse(100));
    }
    public static void numberToWords(int number){
        int limit=getDigitCount(number);
        number=reverse(number);

        int lastdigit=0;
        if (number < 0){
            System.out.println("Invalid Value");
        }else{
            while(limit > 0){
                limit--;
                lastdigit=number%10;
                number=number/10;
                switch (lastdigit){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;


                }

            }

        }
    }

    public static int reverse(int number){
        int answer=0;
        int rnumber=0;
        while (number != 0){
            int lastdigit=number%10;
            rnumber=rnumber*10+lastdigit;
            number=number/10;


        }

        return rnumber;


    }
    public static int   getDigitCount (int number){
        int count=0;
        if (number <0){
            return -1;
        }
             do {

            count=count+1;
            number=number/10;

            }while (number>0);

        return count;

    }
}
