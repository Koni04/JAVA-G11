import java.util.Scanner;

public class kurtMathClass 
{
   public static void main(String []args)
    {
        try (Scanner sc = new Scanner(System.in))
        {
            String choice = "";
            String choice1 = "";
            String choice2 = "";
            String ch;
            String yes = "Y";
            boolean mthd = false;
            boolean end = false;

            while(!mthd && !end)
            {
                System.out.println("Welcome! Please choose the desired method to give an example from!");
                System.out.print("floor, ceil, min, pow, abs, round: ");
                ch = sc.next();

                switch(ch)
                {
                    case "floor":
                    System.out.println("floor method selected!");
                    System.out.print
                    ("Do you want to know what is the floor method? (Y/N) ");
                    choice = sc.next();
                    if(choice.equals(yes) && !mthd)
                    {
                        System.out.println
                        ("<-------------------------------------------------------------------->");
                        System.out.println
                        ("floor method in java programming rounds a " +
                        "floating point value down to the nearest integer value.");
                        System.out.println
                        ("<-------------------------------------------------------------------->");
                    }
                    else;
                    mthd = true;
                    if(choice.equals(yes) && mthd)
                    {
                        System.out.print("Do you want an example? (Y/N) ");
                        choice1 = sc.next();

                        if(choice1.equals(yes) && mthd )
                        {
                            double flr = Math.floor(10.07);
                            System.out.println
                            ("<!--------------------------------------------------------------------!>");
                            System.out.println("We want to round a floating point value down" +
                            " (10.7) to its nearest integer value, therefore it becomes = " +flr );
                            System.out.println
                            ("<!--------------------------------------------------------------------!>");
                        }

                        if(choice1.equals(yes) && mthd)
                        {
                            mthd = false;
                        }
                        else;
                            mthd = true;
                            end = true;
                    }
                    if(!choice2.equals(yes) && !mthd)
                        {
                            mthd = false;
                        }
                        if(mthd == true || !choice.equals(yes) && !mthd)
                        {
                            System.out.print("Do you want to browse more of the Math class methods? (Y/N) ");
                            choice2 = sc.next();
                        }
                        if(choice2.equals(yes))
                        {
                            mthd = false;
                            end = false;
                        }
                        else;
                            mthd = true;
                            end = true;
                    
                    break;
                    case "ceil":
                    System.out.println("ceil method selected!");
                    System.out.print
                    ("Do you want to know what is the ceil method? (Y/N) ");
                    choice = sc.next();
                    if(choice.equals(yes) && !mthd)
                    {
                        System.out.println
                        ("<-------------------------------------------------------------------->");
                        System.out.println
                        ("ceil method in java programming rounds a " +
                        "floating point value up to the nearest integer value. The rounded value is " +
                        "returned as a double.");
                        System.out.println
                        ("<-------------------------------------------------------------------->");
                    }
                    else;

                    mthd = true;

                    if(choice.equals(yes) && mthd)
                    {
                        System.out.print("Do you want an example? (Y/N) ");
                        choice1 = sc.next();

                        if(choice1.equals(yes) && mthd )
                        {
                            double ceil = Math.ceil(6.251);
                            System.out.println
                            ("<!--------------------------------------------------------------------!>");
                            System.out.println("We want to round a floating point value up" +
                            " (6.251) to its nearest integer value, therefore it becomes = " +ceil );
                            System.out.println
                            ("<!--------------------------------------------------------------------!>");
                        }

                        if(choice1.equals(yes) && mthd)
                        {
                            mthd = false;
                        }
                        
                        mthd = true; 
                    }
                    if(!choice2.equals(yes) && !mthd)
                        {
                            mthd = false;
                        }
                        if(mthd == true || !choice.equals(yes) && !mthd)
                        {
                            System.out.print("Do you want to browse more of the Math class methods? (Y/N) ");
                            choice2 = sc.next();
                        }
                        if(choice2.equals(yes))
                        {
                            mthd = false;
                            end = false;
                        }
                        else;
                            mthd = true;
                            end = true;
                    break;
                    case "min":
                    System.out.println("min method selected!");
                    System.out.print
                    ("Do you want to know what is the min method? (Y/N) ");
                    choice = sc.next();
                    if(choice.equals(yes) && !mthd)
                    {
                        System.out.println
                        ("<-------------------------------------------------------------------->");
                        System.out.println
                        ("min method in java programming returns the smallest parameter/number");
                        System.out.println
                        ("<-------------------------------------------------------------------->");
                    }
                    else;

                    mthd = true;

                    if(choice.equals(yes) && mthd)
                    {
                        System.out.print("Do you want an example? (Y/N) ");
                        choice1 = sc.next();

                        if(choice1.equals(yes) && mthd )
                        {
                            int m1 = 17;
                            int m2 = 41;
                            int ceilFinal = Math.min(m1, m2);
                            System.out.println
                            ("<!--------------------------------------------------------------------!>");
                            System.out.println("There are 2 sets of numbers (17, 41) and "+ 
                            "we want to get the smallest parameter, therefore the smallest value is " +ceilFinal);
                            System.out.println
                            ("<!--------------------------------------------------------------------!>");
                        }

                        if(choice1.equals(yes) && mthd)
                        {
                            mthd = false;
                        }
                        
                        mthd = true;
                        
                    }
                    if(!choice2.equals(yes) && !mthd)
                        {
                            mthd = false;
                        }
                        if(mthd == true || !choice.equals(yes) && !mthd)
                        {
                            System.out.print("Do you want to browse more of the Math class methods? (Y/N) ");
                            choice2 = sc.next();
                        }
                        if(choice2.equals(yes))
                        {
                            mthd = false;
                            end = false;
                        }
                        else;
                            mthd = true;
                            end = true;
                    break;
                    case "pow":
                    System.out.println("pow method selected!");
                    System.out.print
                    ("Do you want to know what is the pow method? (Y/N) ");
                    choice = sc.next();
                    if(choice.equals(yes) && !mthd)
                    {
                        System.out.println
                        ("<-------------------------------------------------------------------->");
                        System.out.println
                        ("pow method in java programming takes two (2) parameters " +
                        "and returns the first parameter raised to the power of the second parameter.");
                        System.out.println
                        ("<-------------------------------------------------------------------->");
                    }
                    else;

                    mthd = true;

                    if(choice.equals(yes) && mthd)
                    {
                        System.out.print("Do you want an example? (Y/N) ");
                        choice1 = sc.next();

                        if(choice1.equals(yes) && mthd )
                        {
                            double p1 = 6;
                            double p2 = 2;
                            double powFinal = Math.pow(p1, p2);
                            System.out.println
                            ("<!--------------------------------------------------------------------!>");
                            System.out.println("There are 2 sets of numbers (6, 2) and "+ 
                            "we want to get the raise the first parameter using the second parameter, therefore the result is " +powFinal);
                            System.out.println
                            ("<!--------------------------------------------------------------------!>");
                        }

                        if(choice1.equals(yes) && mthd)
                        {
                            mthd = false;
                        }
                        
                        mthd = true;

                        if(mthd == true)
                        {
                            System.out.print("Do you want to browse more of the Math class methods? (Y/N) ");
                            choice2 = sc.next();
                        }
                        if(choice2.equals(yes))
                        {
                            mthd = false;
                            end = false;
                        }
                        else;
                            mthd = true;
                            end = true;
                    }
                    break;
                    case "abs":
                    System.out.println("abs method selected!");
                    System.out.print
                    ("Do you want to know what is the abs method? (Y/N) ");
                    choice = sc.next();
                    if(choice.equals(yes) && !mthd)
                    {
                        System.out.println
                        ("<-------------------------------------------------------------------->");
                        System.out.println
                        ("abs method in java programming returns the absolute value of its parameter.");
                        System.out.println
                        ("<-------------------------------------------------------------------->");
                    }
                    else;

                    mthd = true;

                    if(choice.equals(yes) && mthd)
                    {
                        System.out.print("Do you want an example? (Y/N) ");
                        choice1 = sc.next();

                        if(choice1.equals(yes) && mthd )
                        {
                            int abs1 = -53;
                            int absFinal = Math.abs(abs1);
                            System.out.println
                            ("<!--------------------------------------------------------------------!>");
                            System.out.println("There is a number (-53) and "+ 
                            "we want to get its absolute value, therefore the absolute value is " +absFinal);
                            System.out.println
                            ("<!--------------------------------------------------------------------!>");
                        }

                        if(choice1.equals(yes) && mthd)
                        {
                            mthd = false;
                        }
                        
                        mthd = true;

                    }
                    if(!choice2.equals(yes) && !mthd)
                        {
                            mthd = false;
                        }
                        if(mthd == true || !choice.equals(yes) && !mthd)
                        {
                            System.out.print("Do you want to browse more of the Math class methods? (Y/N) ");
                            choice2 = sc.next();
                        }
                        if(choice2.equals(yes))
                        {
                            mthd = false;
                            end = false;
                        }
                        else;
                            mthd = true;
                            end = true;
                    break;
                    case "round":
                    System.out.println("round method selected!");
                    System.out.print
                    ("Do you want to know what is the round method? (Y/N) ");
                    choice = sc.next();
                    if(choice.equals(yes) && !mthd)
                    {
                        System.out.println
                        ("<-------------------------------------------------------------------->");
                        System.out.println
                        ("round method in java programming returns the "+
                        "value of a number rounded to the nearest integer.");
                        System.out.println
                        ("<-------------------------------------------------------------------->");
                    }
                    else;

                    mthd = true;

                    if(choice.equals(yes) && mthd)
                    {
                        System.out.print("Do you want an example? (Y/N) ");
                        choice1 = sc.next();

                        if(choice1.equals(yes) && mthd )
                        {
                            double rnd1 = 21.42;
                            double rndFinal = Math.round(rnd1);
                            System.out.println
                            ("<!--------------------------------------------------------------------!>");
                            System.out.println("There is a number (21.42) and "+ 
                            "we want to get it rounded to its nearest integer, therefore the result of the rounded number is " +rndFinal);
                            System.out.println
                            ("<!--------------------------------------------------------------------!>");
                        }

                        if(choice1.equals(yes) && mthd)
                        {
                            mthd = false;
                        }
                        
                        mthd = true;

                        if(mthd == true || !choice.equals(yes) && !mthd)
                        {
                            System.out.print("Do you want to browse more of the Math class methods? (Y/N) ");
                            choice2 = sc.next();
                        }
                        if(choice2.equals(yes))
                        {
                            mthd = false;
                            end = false;
                        }
                        else;
                            mthd = true;
                            end = true;
                        
                    }
                    break;
                }  
                    if(choice2.equals(yes) && mthd && end)
                    {
                        mthd = false;
                        end = false;
                        
                    }   
            }
                if(!choice2.equals(yes) && mthd && end)
                {
                    System.out.println("<---PROGRAM TERMINATED--->");
                }
            
        }  
    }  
}