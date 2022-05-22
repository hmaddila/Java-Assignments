package Constructors;
import java.util.Scanner;

public class DefaultConstructor {

	String name;
	int emp_id;
	int year;
	boolean status;
	int ryear;

	DefaultConstructor()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name: ");
		name=sc.nextLine();

		Scanner s=new Scanner(System.in);
		System.out.println("Enter Employee id: ");
		emp_id=s.nextInt();

		Scanner y=new Scanner(System.in);
		System.out.println("Enter joined year: ");
		year=y.nextInt();

		if(year<2020)
		{
			status=false;
			ryear=year+5;
		}
		else
		{
			status=true;
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		DefaultConstructor obj = new DefaultConstructor();		
		System.out.println("Employee's presence in the organization: ");
		System.out.println("Employee name: " + obj.name);
		System.out.println("Employee id = " + obj.emp_id);	    
		System.out.println("Employee currently working in the organization: "+obj.status);
		System.out.println("Employee's releaved year: "+obj.ryear);

	}
}
