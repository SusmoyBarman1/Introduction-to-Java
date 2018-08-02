
package basicjava;

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        ch = input.next().charAt(0);
        int a = ch;
        System.out.printf("The ascii value of the character is: %d\n",a);
    }
}
