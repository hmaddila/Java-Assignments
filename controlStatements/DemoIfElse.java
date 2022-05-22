package controlStatements;
import java.util.Scanner;
public class DemoIfElse {
	public static void main(String []args)
    {
        //Take input from the user
        //Create an instance of the Scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        if(num>0)
        {
            System.out.println("The entered number "+num+" is positive.");
        }
        else
        {
            System.out.println("The entered number "+num+" is negative.");
        }
    }
}


