package things;

import java.util.Random;

public class Book {

    private final String subject;
    private double price;


    public Book(String subject, double price){
        this.subject = subject;
        this.price = price;


    }



    public String getSubject() {
            return subject;
    }

    public double getPrice() {
        return price;
    }


    public void displayInfo(){

        System.out.print("Type-> Book->\t\t\t");
        System.out.printf("Subject:\t%s", subject);
        System.out.printf("\t\t\tPrice:\t\t\t\t%-10.2f", price);

    }
}
