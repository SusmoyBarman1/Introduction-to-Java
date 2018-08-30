public class University
{
    final String UNIVERSITY_NAME = "RU"; // It can not be modified.
    final int ID; // blank final variable which i have to initialize in the constructor.
    static final String NAME; //blank static final variable which i have to initialize in the static block.

    University()
    {
        ID = 1610576113;
    }
    static
    {
        NAME = "Susmoy Barman";
    }

    void displayInfo()
    {
        System.out.println("University name: "+UNIVERSITY_NAME);
        System.out.println("Name: "+NAME);
        System.out.println("ID: "+ID);
    }
}