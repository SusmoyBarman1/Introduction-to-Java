
package basicjava;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        num = input.nextInt();
        if(num>0)
            System.out.println("The number is positive");
        else if(num==0)
            System.out.println("The number is zero");
        else
            System.out.println("The number is negative");
            
    }
}
