
package basicjava;

public class String_2 {
    public static void main(String[] args) {
        String firstName = "Susmoy";
        String lastName = " Barman";
        
        // Now we will add two strings.
        String fullName = firstName + lastName;
        System.out.println("FullName is: "+fullName);
        
        // another method ot add two string.
        fullName = firstName.concat(lastName);
        System.out.println("FullName is: "+fullName);
        
        String upperName = fullName.toUpperCase();
        System.out.println("upperName: "+upperName);
        
        String lowerName = fullName.toLowerCase();
        System.out.println("upperName: "+lowerName);
        
        boolean b = firstName.startsWith("S");
        System.out.println("The value of b: "+b);
        
        boolean c = lastName.endsWith("A");
        System.out.println("The value of c: "+c);
        
        String[] s = {"susmoy","barman","tiash","cse","ru"};
        
        //For each loop
        for(String x: s){
            System.out.print(" "+x);
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(" "+s[i]);
        }
        System.out.println();
    }
}
