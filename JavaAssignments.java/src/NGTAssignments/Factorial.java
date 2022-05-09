package NGTAssignments;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
    Scanner sc=new Scanner(System.in);
    int i,fact=1;
    System.out.println("Enter the factorial value of i");
    i=sc.nextInt(); 
	Factorial factorialNumber = new Factorial();
	factorialNumber.fact(i,fact);
}
	public void fact(int i,int fact) {
	for(int j=i;j>=1;j--) {
		fact=fact*j;
	}
	System.out.println("Factorial of given number is :" + fact);

	} 
	}