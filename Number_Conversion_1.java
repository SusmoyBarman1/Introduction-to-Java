
package basicjava;

import java.util.Scanner;

public class Number_Conversion_1 {
    public static void main(String[] args) {
        // Decimal to binary, octal &  hexadecimal
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        
        String binary = Integer.toBinaryString(a);
        System.out.println("binary= "+binary);
        
        String octal = Integer.toOctalString(a);
        System.out.println("octal = "+octal);
        
        String hexadecimal = Integer.toHexString(a);
        System.out.println("Hexadecimal = "+hexadecimal);
        
    }
}
