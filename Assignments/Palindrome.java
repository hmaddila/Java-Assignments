package Assignments;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String actual,reverse = "";//objects of string class
	    Scanner sc = new Scanner(System.in);  
System.out.println("Enter the number to check whether it is palindrome or not");
actual = sc.nextLine();	
int length = actual.length();   
for ( int i = length - 1; i >= 0; i-- )  
   reverse = reverse + actual.charAt(i);  
if (actual.equals(reverse)) {
	System.out.println("enter number is a palindrome");
}
else  
    System.out.println("Entered string/number isn't a palindrome.");  
}

}

