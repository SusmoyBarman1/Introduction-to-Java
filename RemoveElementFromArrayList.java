
package basicjava;

import java.util.ArrayList;

public class RemoveElementFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(0,20);// Inserting
        arr.add(30);
        arr.add(40);
        
        //System.out.println(arr);
        // using for each loop
        System.out.println("Before removing:"+arr);
        arr.remove(2);// removing by index
        System.out.println("After removing:"+arr);
        System.out.println("\n"+arr.size());
    }
}
