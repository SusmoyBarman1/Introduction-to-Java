
package basicjava;

public class String_4 {
    public static void main(String[] args) {
        String s1 = "This is my country";
        System.out.println(s1);
        
        String s2 = s1.replace('i', 'j');  // It will replace all 'i' character by 'j'.
        System.out.println(s2);
        
        String[] s3 = s1.split(" "); // This method will divide string s1 where the space character found.
        
        for(String x: s3){
            System.out.println(x);
        }
    }
}
