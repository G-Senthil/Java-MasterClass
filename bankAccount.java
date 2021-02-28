package Senthil.Java;

public class bankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;
    public bankAccount(){
        this("0000",100,"New customer","Email ID","phone number");
        System.out.println("From the empty constructor");
    }
    public bankAccount(String number,double balance,String customerName,String customerEmailAddress,String customerPhoneNumber){
        System.out.println("Inside contructor parameter");
        this.number=number;
         this.balance=balance;
         this.customerName=customerName;
         this.customerEmailAddress=customerEmailAddress;
         this.customerPhoneNumber=customerPhoneNumber;
    }
    public void deposit(double depositAmount){
        this.balance +=depositAmount;
        System.out.println("Deposited amount is "+ depositAmount + "New balance amount is "+this.balance);

    }
    public void withdrawal(double withdrawalAmount){
        if(this.balance - withdrawalAmount <0){
            System.out.println("Insuffucient balance");
        }else {

            this.balance -=withdrawalAmount;
            System.out.println("The balance amount is "+this.balance );
        }

    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
