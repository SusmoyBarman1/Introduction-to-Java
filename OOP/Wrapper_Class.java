
package basicjava;

public class Wrapper_Class {
    public static void main(String[] args) {
        int a = 22;
        //Premetive to object
        
        Integer y = Integer.valueOf(a);
        System.out.println("y = "+y);
        
        Integer z = a; // compiler will take valueOf(a) autometically, this is called autoboxing.
        System.out.println("z = "+z);
        // Object to premetive
        
        Character ch = new Character('a');
        char c = ch.charValue();
        
        char c1 = ch; // compiler will take charValue() autometically. This is called unboxing.
        System.out.println("c = "+c);
        System.out.println("c1 = "+c1);
    }
}
