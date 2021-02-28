package Senthil.Java;

public class megabyteconvertor {
    public static void main(String[] args) {
     printMegaBytesAndKiloBytes(2500);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            long result1=kiloBytes/1024;
            long result2=kiloBytes%1024;
            System.out.println(kiloBytes+ " KB = " + result1 +" MB" + " and "+ result2 +" KB");
        }

    }
}
