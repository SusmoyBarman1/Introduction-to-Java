
package basicjava;

public class String_3 {
    public static void main(String[] args) {
        String country = "         Bangladesh is my country          ";
        System.out.println(country);
        
        String s3 = country.trim();
        System.out.println("After removing the spaces from the first and last in the string: "+s3);
        
        char ch = country.charAt(0);
        System.out.println("Character at 0 index: "+ch);
        
        int value = country.codePointAt(0);
        System.out.println("The ascii value of the character at index 0: "+value);
        
        int pos = country.indexOf('n');
        System.out.println("The first index of 'n' in the string: "+pos);
        
        pos = country.lastIndexOf('n');
        System.out.println("The last index of character 'n' is: "+pos);
    }
}
