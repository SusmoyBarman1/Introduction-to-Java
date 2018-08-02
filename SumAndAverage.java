
package basicjava;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] arr = new double[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = input.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += arr[i];
        }
        double ave = sum/10;
        System.out.println("The sum of the array is: "+sum);
        System.out.println("The average of the array is: "+ave);
        // length of a array: array.length
    }
}
