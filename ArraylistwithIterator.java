
package basicjava;
import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistwithIterator {
    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(0,20);// Inserting
        arr.add(30);
        arr.add(40);
        
        //Using iterator for print the list.
        Iterator itr = arr.iterator();
        while(itr.hasNext()){
            System.out.print(" "+itr.next());
        }
        
        System.out.println("\n"+arr.size());
    }
}