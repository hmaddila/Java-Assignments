package NGTAssignments;
import java.util.Scanner;
public class StringChar {
public static void main(String[] args) {
	System.out.println("Enter the string ");
	Scanner sc=new Scanner(System.in);
	char obj = sc.next().charAt(0);
	String st = Character.toString(obj);
	System.out.println("The string is: " + st);
	  String st2 = new String(st);
}
}