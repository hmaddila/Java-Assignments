package NGTAssignments;

import java.util.Scanner;

public class EvenNumbers {
	public void harika(int a) 
	{
		if(a%2==0) {
			System.out.println(a + "It is an Even Number");
		}
		else {
			System.out.println("It is an Odd Number");
		}
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=sc.nextInt();
		EvenNumbers evenNumbers = new EvenNumbers();
		evenNumbers.harika(a);
	}
}
