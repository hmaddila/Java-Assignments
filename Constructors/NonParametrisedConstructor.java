package Constructors;
import java.util.Scanner;
class Organization
{
	String name;
	public Organization() 
	{
		System.out.println("Enter your organization name");		  
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();    
	}
}

public class NonParametrisedConstructor 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Organization o = new Organization();
		System.out.println("Your Organization name = " + o.name);
		System.out.println("Eligible to enroll");
	}

}
