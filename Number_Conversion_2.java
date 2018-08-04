
package basicjava;

import java.util.Scanner;

public class Number_Conversion_2 {
    public static void main(String[] args) {
        // Binary,Octal,Hexadecimal to Decimal
        Scanner input = new Scanner(System.in);
        
        //Binary to decimal
        String binary = input.nextLine();
        Integer a = Integer.parseInt(binary, 2);
        System.out.println("a = "+a);
        

        //Octal to decimal
        String octal = input.nextLine();
        Integer a1 = Integer.parseInt(octal, 8);
        System.out.println("a = "+a1);
        
        //Hexadecimal to decimal
        String hex = input.nextLine();
        Integer a2 = Integer.parseInt(hex, 16);
        System.out.println("a = "+a2);
        
    }
}
