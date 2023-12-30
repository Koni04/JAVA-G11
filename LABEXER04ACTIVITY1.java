public class LABEXER04ACTIVITY1
{
    public static void main(String[]args) // main class
    {
        int[] myArrays = {18,26,30}; // index and value

        int sum = 0; // int sum = 0

        for(int x=0; x<myArrays.length; x++) // int x index =0; x<name.lenght; i++ increment
        {
            sum += myArrays[x]; // sum += to name of integer
    
            System.out.println("the sum is "+sum+"."); // it will print
        }
    }
}