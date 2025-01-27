package things;

import living.Person;

import java.util.ArrayList;

public class BookBag {

    private Person owner;
    private ArrayList items;

    public BookBag(Person owner){
        this.owner = owner;
        items = new ArrayList<>();

    }

    public Person getOwner(){
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public ArrayList getItems(){
        return items;
    }
    public void listItems(){

    }
    public void displayItems(){

        for(Object item: items){
            if(item instanceof Phone){
                ((Phone) item).displayInfo();
                System.out.println();
            }else if(item instanceof Book){
                ((Book)item).displayInfo();
                System.out.println();
            }else if(item instanceof PencilBag){
                ((PencilBag)item).displayContains();
                System.out.println();
            }
        }

    }
}
