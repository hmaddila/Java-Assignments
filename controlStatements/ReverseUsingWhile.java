package controlStatements;

import java.util.Scanner;

public class ReverseUsingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int a=sc.nextInt();
		sc.close();
		int rev=0;
		int res;
		int sum=0;
		while(a!=0) {
			res=a%10;
			rev=rev*10+res;
			a=a/10;
			if(res%2==0)
			{
				sum=sum+res;
			}
			
		}
		System.out.println(sum);
		System.out.println(rev);
	}

}
