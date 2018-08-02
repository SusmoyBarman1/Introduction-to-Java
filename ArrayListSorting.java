
package basicjava;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(1);
        arr.add(5);
        arr.add(-1);
        arr.add(7);
        arr.add(2);
        arr.add(12);
        arr.add(123);
        
        System.out.println("List before sort: "+arr);
        
        Collections.sort(arr);
        System.out.println("List after sorted in accending order: "+arr);
        
        Collections.sort(arr, Collections.reverseOrder());
        System.out.println("List after sorted in descending order: "+arr);
    }
}
