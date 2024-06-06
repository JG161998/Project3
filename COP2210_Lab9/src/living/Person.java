package living;

import things.*;

public class Person {

    private String firstName;
    private String lastName;
    private BookBag bookBag = null;


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;


    }

    public void getFirstName(String firstName){

        }
        public String getLastName(){
        return lastName;
    }
        public void setLastName(String lastName){

        }
        public BookBag getBookBag (){
        return bookBag;

        }
        public void setBookBag(BookBag bookBag){
        this.bookBag = bookBag;
        }
        public double totalPriceOfPossessions(){

        double sum = 0;

        for(Object totalPrice: bookBag.getItems()){
            if(totalPrice instanceof Phone) {
                sum += ((Phone) totalPrice).getPrice();

            }else if(totalPrice instanceof Book) {
                sum += ((Book) totalPrice).getPrice();

            }
            if(totalPrice instanceof PencilBag)
            for(Object totalPrice2: ((PencilBag)totalPrice).getPens()) {
                sum+= ((Pen)totalPrice).getPrice();
            }
            return sum;
            }








        return 0;
    }

}
