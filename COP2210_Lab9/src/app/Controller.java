package app;

import living.Person;
import things.*;

import java.util.Random;


public class Controller {

    public static void main(String[] args){

        yourInfoHeader();

        Random rndGen = new Random();
        Person person = new Person("Mike", "Johnson");
        BookBag bookBag = new BookBag(person);
        person.setBookBag(bookBag);


        for(int i = 1; i <= 5; i++) {
            String phoneNumber;
            int areaCode = rndGen.nextInt(900) + 100;
            int threeDigits = rndGen.nextInt(900) + 100;
            int fourDigits = rndGen.nextInt(900) + 1000;
            phoneNumber = "(" + areaCode + ")-" + threeDigits + "-" + fourDigits;
            Phone phone = new Phone(phoneNumber);
            bookBag.getItems().add(phone);

        }



        // Step 10
            String[] subject = {"Math", "Chemistry", "CS", "Physics", "History"};
            for(int i = 1; i <= 4; i++){
                int rndpen = rndGen.nextInt(subject.length);
                int bookprice = rndGen.nextInt(200)+50;
                Book book = new Book(subject[rndpen], bookprice);
                bookBag.getItems().add(book);


            }



            //Step 11
            PencilBag pencilBag = new PencilBag();
            bookBag.getItems().add(pencilBag);
            String[] colors = {"Red", "Black", "Green", "Blue"};
            for(int i = 1; i <= 5; i++){
                Pen pen = new Pen(colors[rndGen.nextInt(4-0)+0], (rndGen.nextDouble() * (4-1)+1));
                pencilBag.getPens().add(pen);

            }
            bookBag.displayItems();

            System.out.println();
            System.out.println("--------------------------------------");
            System.out.println("Total Price of Possessions");
            System.out.println("--------------------------------------");
            System.out.printf("Total:\t\t\t\t$%10.2f",person.totalPriceOfPossessions());








    }


    public static void yourInfoHeader(){

        System.out.println("========================================");
        System.out.println("PROGRAMMER:  " + "JOSHUA GOMEZ");
        System.out.println("PANTHER ID:  " + "6082979");
        System.out.println();
        System.out.println("CLASS: \t\t COP2210");
        System.out.println("SECTION: \t "+ "U02");
        System.out.println("SEMESTER: \t " + "FALL 2021");
        System.out.println("CLASSTIME: \t " + "TUESDAY/THURSDAY 5:00-7:45PM");
        System.out.println();
        System.out.println("Assignment: " + "LAB 9");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understand FIU's academic policies, and I certfify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other person.");
        System.out.println("==========================================");
        System.out.println();

    }
}
