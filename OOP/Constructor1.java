import java.util.Scanner;

public class Constructor1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int p;
        String n,g;
        p = input.nextInt(); 
        n = input.nextLine();
        g = input.nextLine();
        Constructor ob1 = new Constructor(n,g,p);
        ob1.displayInformation();
        System.out.println("\n");

    }
}