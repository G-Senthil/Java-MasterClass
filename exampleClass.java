package Senthil.Java;

import java.util.Locale;

public class exampleClass {
    private int wheels;
    private int tyres;
    private int steering;
    private String model;
    private String colour;
    public void setModel(String model){

        String carname=model;
        carname.toLowerCase();

        if(carname.equals("ferrari") || carname.equals("ford")){
            this.model=model;
        }

    }
    public String getModel(){
        return this.model;
    }

}
