import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       
       System.out.println("Please enter a string to crash, or number to continue: ");
       // If a string is entered, a run time error is produced
       int num = input.nextInt();
       
       // Will produce a compiler error
       // int num = input.nextDouble(); 
       
       // If zero is entered, a run time error is produced.
       System.out.println("5 / " + num + " = " + (5 / num));
        
    }
}
