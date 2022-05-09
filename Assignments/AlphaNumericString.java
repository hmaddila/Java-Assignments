package Assignments;
import java.util.Scanner;
public class AlphaNumericString {
public static void main(String[] args) {
	System.out.println("Enter the string that also contains numbers");
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String numbers=str.replaceAll("[^0-9]"," ");
System.out.println("print the numbers in the string:  "+ numbers);
}

}
