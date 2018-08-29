public class Static_Method
{
    void display1()
    {
        //display2(); // It will work, because non static method can call the static method.
        System.out.println("I am free!!");
    }   
    static void display2()
    {
        //display1();  // It will not work, because static method can not call non static method
        System.out.println("I am static.");
    }
}