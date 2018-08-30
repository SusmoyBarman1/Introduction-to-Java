public class Teacher extends Person
{
    private String qualification;

    public void setQualification(String qualification)
    {
        this.qualification = qualification;
    }

    public void displayInfo2()
    {
        displayInfo1();
        System.out.println("Qualification: "+qualification);
    }
}