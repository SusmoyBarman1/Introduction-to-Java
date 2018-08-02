
package basicjava;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r,area;
        r = input.nextDouble();
        area = 3.1416*r*r;
        System.out.printf("The area is: %f\n",area);
    }
}
