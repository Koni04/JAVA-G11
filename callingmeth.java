public class callingmeth 
{
    public static void main (String[]args)
    {
        doSomething(4);
    }   
    private static void doSomething (int x)
    {
        System.out.println(x * x);
    }
}