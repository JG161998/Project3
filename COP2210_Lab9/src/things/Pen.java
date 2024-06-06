package things;

public class Pen {

    private String color;
    private double price;

    public Pen(String color, double price){
            this.color = color;
            this.price = price;
    }
    public String getColor(){
        return color;
    }
    public double getPrice(){
        return price;
    }
    public void displayInfo(){

        System.out.printf("Type-> Pen->\t\t\t");
        System.out.printf("Color:\t\t%s", color);
        System.out.printf("\t\t\tPrice:\t\t\t\t%-10.2f", price);
    }
}
