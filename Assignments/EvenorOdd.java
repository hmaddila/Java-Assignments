package Assignments;

import java.util.Scanner;

public class EvenorOdd {
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
		EvenorOdd evenNumbers = new EvenorOdd();
		evenNumbers.harika(a);
	}
}
