public class LABEXER32 
{
   public static void main(String[]args) // nain class
   {
    for (int x =1; x<=20; x=x+1)  // 1 to 20 with increment
    // for loop
    {
        if(x % 2 == 1)  // if value of x modulo 2 are equal to 1
        {
            continue; // it will continue
        }
        System.out.println(x); // will print value of x 
    }
   } 
}