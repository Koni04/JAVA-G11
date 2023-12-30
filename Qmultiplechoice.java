import java.util.Scanner;

public class Qmultiplechoice 
{    
   
     public static void main (String[]args)  
    {
       Scanner sc = new Scanner(System.in);

	   int correct = 0;

       int incorrect=0;

      int questions = 5;

      System.out.print("\n");
      System.out.println("Multiple Choice Quiz");

      System.out.print("\n");

       String[][] Ques_Ans = 
       {

        {"Whats is the color of the sky? ","\n A. blue \n B. gray \n C. yellow \n D. green\n","A"},
        {"Whats is the color of the sun? ","\n A. blue \n B. gray \n C. yellow \n D. green\n","C"},
        {"Whats is the color of the leaves ","\n A. blue \n B. gray \n C. yellow \n D. green\n","D"},
        {"Whats is the color of the moon? ","\n A. blue \n B. gray \n C. yellow \n D. green\n","B"},
        {"Whats is the color of the banana? ","\n A. blue \n B. pink \n C. yellow \n D. green\n","C"},

       };

      String[] user_ans = new String[(int) questions];

      int i=0;

        do
        {
          System.out.print("" + (i+1) + ". " + Ques_Ans[i][0] + "   "+Ques_Ans[i][1]);

          user_ans[i] = String.valueOf(sc.next().charAt(0));

          if (Ques_Ans[i][2].equals(user_ans[i].toUpperCase())) 
           {
              System.out.println("\n Correct Answer!");

               correct++; 
           }      
          else
           {
              System.out.println("\n Incorrect. The correct answer is "+Ques_Ans[i][2]);

              incorrect++;
           }
          System.out.print("\n");

          i++;
       
        }while(i<questions);                      

        System.out.print("\n");
        System.out.print("\t===== DISPLAY RESULTS =====");
        System.out.print("\n");
        System.out.println("\n Number of correct answers: "+ correct);
        System.out.println("\n Number of incorrect answers: "+ incorrect);
        System.out.print("\n");
        System.out.print("\tEnd of Program");
        System.out.print("\n");
        System.exit(0);

        sc.close();
    }
}