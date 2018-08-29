import java.text.DecimalFormat;

public class DecimalNumberFormat
{
    public static void main(String[] args) 
    {
        DecimalFormat ob = new DecimalFormat("0.000");
        double x = 2.3456789;
        System.out.println("\nX: "+ob.format(x)+"\n");    
        System.out.printf("X: %.3f\n\n",x);
    }
}