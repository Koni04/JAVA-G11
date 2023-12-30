public class LABEXER04ACTIVITY2
{
    public static void main(String[]args)
    {
        int[] myArrays = {18,26,30};

        int product = 0;

        for(int x=0; x<myArrays.length; x++)
        {
            product += myArrays[x];
    
            System.out.println("the product is "+product+".");
        }
    }
}