public class Person
{
    String name;
    String haircolor;
    int age;

    Person(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    Person(String name,String haircolor,int age)
    {
        this(name,age);
        this.haircolor = haircolor; 
    }
    void displayInfo()
    {
        System.out.println("\nName : "+name);
        System.out.println("Age : "+age);
        System.out.println("Haircolor : "+haircolor+"\n");
    }
}