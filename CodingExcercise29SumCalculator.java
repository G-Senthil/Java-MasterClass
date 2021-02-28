package Senthil.Java;

public class CodingExcercise29SumCalculator {

    private double firstNumber;
    private double secondNumber;
    public double getFirstNumber(){
        return this.firstNumber;
    }
    public double getSecondNumber(){
        return this.secondNumber;
    }
    public void setFirstNumber(double aFirstNumber){
        this.firstNumber=aFirstNumber;
    }
    public void setSecondNumber(double aSecondNumber){

        this.secondNumber=aSecondNumber;
    }
    public double getAdditionResult(){
        return (this.firstNumber+this.secondNumber);
    }

    public double getSubtractionResult(){
        return (this.firstNumber-this.secondNumber);
    }
    public double getMultiplicationResult(){
        return (this.firstNumber*this.secondNumber);
    }
    public double getDivisionResult(){

        if(this.secondNumber!=0){
            return (this.firstNumber/this.secondNumber);
        }else{
            return 0;
        }

    }
}
