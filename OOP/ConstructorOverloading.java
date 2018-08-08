public class ConstructorOverloading
{
    int phone;
    String name,gender;

    ConstructorOverloading()
    {
        System.out.println("No data\n");
    };

    ConstructorOverloading(String n,String g)
    {
        name = n;
        gender = g;
    }

    ConstructorOverloading(String n,String g,int p)
    {
        phone = p;
        gender = g;
        name = n;
    }

    void displayInformation()
    {
        System.out.println(name);
        System.out.println(gender);
        System.out.println(phone+"\n");
    }
}