package Assignments;
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=1;i<=12;i++) {
	System.out.println(num+" * "+i+" = "+num*i);  
	}
	}
}
