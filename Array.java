
package basicjava;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[10]; // array declaration and creation.
        for (int i = 0; i < 10; i++) {
            arr[i] = i+5;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}
