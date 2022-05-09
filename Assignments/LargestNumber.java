package Assignments;
import java.util.Scanner;
public class LargestNumber {
public static void main(String [] args) {
	System.out.println("Enter the size of an array");
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int []a = new int[size];
System.out.println("Enter the values");
int largest=0;
for(int i=0;i<a.length;i++) {
	a[i]=sc.nextInt();	
}
largest=a[0];
for(int j=0;j<a.length;j++) {
	 if(largest < a[j]) {
		largest=a[j]; 
	 }
	 
	 }
System.out.println("Maximum value:"+largest);
}
}
