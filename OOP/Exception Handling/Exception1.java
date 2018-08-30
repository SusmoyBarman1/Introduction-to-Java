public class Exception1
{
    public static void main(String[] args) 
    {
        try{
            int x = 3;
            int y = 0;
            int result = x/y;
            System.out.println("Result: "+result);
        }catch(ArrayIndexOutOfBoundsException e){     // or we can just use Exception keyword.
            System.out.println("\nException is: "+e);  
        }    
        finally{
            System.out.println("\nLast line of the program.\n");
        }
    }
}