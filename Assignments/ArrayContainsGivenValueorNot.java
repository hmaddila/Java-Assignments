package Assignments;
import java.util.Scanner;
public class ArrayContainsGivenValueorNot {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of an array");
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int [] num = new int[size];
		System.out.println("Enter the values");
	int count=0;
for(int i=0;i<num.length;i++) {
	num[i]=sc.nextInt();
}
System.out.println("Enter the number to find");
int a=sc.nextInt();
for(int j=0;j<num.length;j++) {
	if(a==num[j]) {
		count++;
		
	}
	
	}
if(count>0) {
	System.out.println("The given number is found");
}
else {
	System.out.println("The given number not found");
}
}
}
