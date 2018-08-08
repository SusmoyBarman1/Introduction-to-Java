public class Constructor
{
    int phone;
    String name,gender;

    Constructor(String n,String g,int p)
    {
        name = n;
        gender = g;
        phone = p;
    }

    void displayInformation()
    {
        System.out.println(name);
        System.out.println(gender);
        System.out.println(phone);
    }
}