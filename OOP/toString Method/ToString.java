public class ToString
{
    String name;
    int age;
    
    ToString(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    public String toString()
    {
        return "Name: "+name+"\nAge: "+age;
    }
}