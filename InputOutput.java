
package basicjava;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num;
        int a,b;
        a=10; b=20;
        num = input.nextDouble();
        System.out.printf("The number is: %f\n",num);
        System.out.println("the first value is: "+a+"the second value is "+b);
    }
}
 