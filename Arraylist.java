
package basicjava;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(0,20);// Inserting
        arr.add(30);
        arr.add(40);
        
        //System.out.println(arr);
        // using for each loop
        for(int x: arr){
            System.out.print(x+" ");
        }
        System.out.println("\n"+arr.size());
    }
}