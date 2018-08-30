
public class Test
{
    public static void main(String[] args)
    {
        MobileUser mu; // reference variable.

        System.out.println();
        mu = new Rahim();
        mu.sendMessage();

        mu = new Karim();
        mu.sendMessage();
        System.out.println();
    }
}