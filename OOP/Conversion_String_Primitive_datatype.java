
package basicjava;

public class Conversion_String_Primitive_datatype {
    public static void main(String[] args) {
        //Integer to String
        int a = 100;
        String s = Integer.toString(a);
        System.out.println("s = "+s);
        
        //Double to String
        double d = 100.33;
        String s1 = Double.toString(d);
        System.out.println("s1 = "+s1);
        
        //String to integer
        /*String str = "100";
        int a1 = Integer.parseInt(str);
        System.out.println("a1 = "+a1);
        
        //String to double
        String str1 = "100.3333";
        double d1 = Double.parseDouble(str1);
        System.out.println("d1 = "+d1);
        */
        // Method 2
        String ss = "100";
        int i = Integer.valueOf(ss);
        System.out.println("i = "+i);
    }
}
