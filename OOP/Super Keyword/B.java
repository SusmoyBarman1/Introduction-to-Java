public class B extends A
{
    int x = 5;
    B()
    {
        System.out.println("B's constructor.");
    }

    void display1()
    {
        System.out.println("The value of x in subclass: "+x);
    }
    void display2()
    {
        System.out.println("The value of x in superclass: "+super.x);
    }

    void displayOverridingMethod()
    {
        super.displayOverridingMethod();
        System.out.println("Inside Class B\n");
    }
}