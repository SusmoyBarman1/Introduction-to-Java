public class StringComparism
{
    public static void main(String[] args) 
    {
        String pass1 = "Susmoy";
        String pass2 = "Susmoy";
        String pass3 = new String("Susmoy");
        String pass4 = new String("Susmoy");

        System.out.println();

        // == will check the reference.
        System.out.println(pass1==pass2);
        System.out.println(pass1==pass3);
        System.out.println(pass3==pass4);

        System.out.println();

            // equal() will check the contents. it will be better.
        System.out.println(pass1.equals(pass2));
        System.out.println(pass1.equals(pass3));
        System.out.println(pass3.equals(pass4));

        System.out.println();
    }
}