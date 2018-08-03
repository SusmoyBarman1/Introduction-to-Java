
package basicjava;

public class String_palindrome {
    public static void main(String[] args) {
        String s1 = "Madam";
        StringBuffer sb = new StringBuffer(s1);
        String s2 = sb.reverse().toString();  // converting buffer to class in string.
        
        if(s2.equals(s1))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
}
