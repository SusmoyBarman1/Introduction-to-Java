
package basicjava;

import java.util.ArrayList;

public class ArrayListFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(0,20);// Inserting
        arr.add(30);
        arr.add(40);
        System.out.println("The real list is: "+arr);
        
        boolean b = arr.isEmpty();
        System.out.println("Array list empty: "+b);
        
        boolean c = arr.contains(30);
        System.out.println("Array containing the value 30: "+c);
        
        int d = arr.indexOf(40);
        System.out.println("index of the value 40: "+d);
        
        arr.set(3, 50);  // It is usually use for replacing a value.
        System.out.println("After setting the value: "+arr);
        
        int e = arr.get(2); // getting value from specified index
        System.out.println("Getting the value from index 2: "+e);
        
        arr.clear();
        System.out.println("After clearing the list: "+arr);
    }
}
