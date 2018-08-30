public class Person
{
    private int age;
    private String name;

    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }

    public void displayInfo1()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}