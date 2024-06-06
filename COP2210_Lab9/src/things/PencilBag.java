package things;
import java.util.ArrayList;

public class PencilBag {

    ArrayList<Pen> pens = new ArrayList<>();

    public PencilBag(){
    }

    public ArrayList<Pen>  getPens(){
        return pens;
    }


    public void displayContains(){

        for(Object obj: pens) {
                if(obj instanceof Pen) {
                    ((Pen)obj).displayInfo();
                    System.out.println();
            }
        }

    }

}
