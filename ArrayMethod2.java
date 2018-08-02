
package basicjava;

import java.util.ArrayList;

public class ArrayMethod2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();      
        ArrayList<Integer> arr2 = new ArrayList<>();      
        ArrayList<Integer> arr3 = new ArrayList<>();      
        
        arr1.add(10);
        arr1.add(20);
        arr1.add(30);
        arr1.add(40);
        arr1.add(50);
        System.out.println("The elements of Array 1: "+arr1);
        
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        arr2.add(4);
        arr2.add(5);
        System.out.println("The elements of Array 2: "+arr2);
        
        arr3.addAll(arr1); // coping all elements of arr1
        System.out.println("The elements of Array 3: "+arr3);
        
        boolean result = arr1.equals(arr2);
        System.out.println("The result is: "+result);
    }
}
