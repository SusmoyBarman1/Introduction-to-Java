
package basicjava;

public class String_1 {
    public static void main(String[] args) {
        String s1 = "susmoy barman";
        String s2 = new String("susmoy barman");
        
        System.out.println("s1: "+s1);
        System.out.println("s2: "+s2);
        
        int len = s1.length();
        System.out.println("Length of s1: "+len);  // Finding the length of the string.
        
        //Now we will find that, whether the strings are equal or not.
        /*if(s1==s2){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal"); // It will show, not equal. Because the == operator match the reference or object, not the content. 
        }
        
        if(s1.equals(s2)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal"); // It will show equal. Because the .equals() method match the contents. 
        } 
        
        if(s1.contains("susmoy")){
            System.out.println("True");
        }
        else{
            System.out.println("Not True"); // It will show true. Because the .contains() method match whether the values are in the s1. 
        } */
        
        if(s1.equalsIgnoreCase("Susmoy barman")){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal"); // It will show equal. Because the .equalsIgnoreCase() method will ignore the case sensitivity. 
        }
        boolean b = s1.isEmpty(); // It will check whether the string empty or not.
        System.out.println("b = "+b);
    }
}
