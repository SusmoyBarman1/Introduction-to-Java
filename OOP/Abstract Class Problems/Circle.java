public class Circle extends Shape
{
    Circle(double dim1)
    {
       super(dim1,dim1);
    }
    void area()
   {
       double result = Math.PI*dim1*dim2;
       System.out.println("Area of circle: "+result+"\n");
    }
}