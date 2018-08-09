public class Func1
{
    public static void main(String[] args) 
    {
        Function ob1 = new Function();
        int a = ob1.square(16);
        System.out.println(a+"\n");
        int b = ob1.multiplication(12, 13);
        System.out.println(b+"\n");
        int c = ob1.multiplication(3, 6, 9);
        System.out.println(c+"\n");
        double d = ob1.multiplication(45.99, 34.11);
        System.out.println(d+"\n");

    }
}