
package basicjava;

import java.util.Scanner;


public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double b,h,area;
        b = input.nextDouble();
        h = input.nextDouble();
        area = 0.5*h*b;
        System.out.printf("The area is: %.2f\n",area);
    }
}
