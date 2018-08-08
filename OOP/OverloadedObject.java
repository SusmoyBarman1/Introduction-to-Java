public class OverloadedObject
{
    public static void main(String[] args) 
    {
        ConstructorOverloading ob1 = new ConstructorOverloading();
        
        ConstructorOverloading ob2 = new ConstructorOverloading("Susmoy Barman","male");

        ConstructorOverloading ob3 = new ConstructorOverloading("Tom cruse","male",121);

        ob1.displayInformation();
        ob2.displayInformation();
        ob3.displayInformation();
    }
}