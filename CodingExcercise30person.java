package Senthil.Java;

public class CodingExcercise30person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public void setFirstName(String a){
        this.firstName=a;
    }
    public void setLastName(String b){
        this.lastName=b;
    }
    public void setAge(int c){
        if((c<0) ||(c>100)){
            this.age=0;
        } else{
            this.age=c;
        }

    }
    public boolean isTeen(){
        if(this.age > 12 && this.age < 20){
            return true;
        }else {
            return false;
        }
    }
    public String getFullName(){
        if(this.firstName=="" && this.lastName==""){
            return "";
        }else if(this.lastName==""){
            return this.firstName;
        }else if(this.firstName=="") {
            return this.lastName;
        }else{
            return (this.firstName +" "+ this.lastName);
        }
    }

}
