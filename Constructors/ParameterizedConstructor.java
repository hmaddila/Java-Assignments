package Constructors;
import java.util.Scanner;

public class ParameterizedConstructor 
{
	String empDetails;	
	ParameterizedConstructor(String details) 
	  {
	    empDetails = details;
	    System.out.println("Your Details: "+empDetails);
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String emp=sc.nextLine();
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your emp id with CG(Ex: CG471): ");
		String emp_id=s.nextLine();		
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your joining month: ");
		String month=in.nextLine();
		
		ParameterizedConstructor obj1 = new ParameterizedConstructor("Your name:" +emp);
		ParameterizedConstructor obj2 = new ParameterizedConstructor("Your Employee id: "+emp_id);
		ParameterizedConstructor obj3 = new ParameterizedConstructor("Your joining month: "+month);
		ParameterizedConstructor o1 = new ParameterizedConstructor("Your practice: NGT");
		ParameterizedConstructor o2 = new ParameterizedConstructor("Your Reporting Manager: Alexander");
	}

}

