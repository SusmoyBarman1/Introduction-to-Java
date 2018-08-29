public class Box
{
    double height;
    double weight;
    double depth;

    Box(double height,double weight,double depth)
    {
        this.height = height;
        this.weight = weight;
        this.depth = depth;
    }
    void displayVol()
    {
        double vol = height*weight*depth;
        System.out.println("Volume : "+vol);
    }

}