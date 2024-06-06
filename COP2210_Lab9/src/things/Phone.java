package things;

import java.util.Random;

public class Phone {

    private String number;
    private double price;

    public Phone(String number){
        this.number = number;
        Random rnd = new Random();
        price = (rnd.nextDouble() * (1450-150) + 150);


    }

    public String getNumber(){
       return number;
    }

    public double getPrice(){
    return price;
    }

    public  void displayInfo(){

        System.out.print("Type-> Phone-> \t\t\t");
        System.out.printf("%s", number);
        System.out.printf("\t\t\t\tPrice:\t\t\t%-10.2f", price);

    }



}
