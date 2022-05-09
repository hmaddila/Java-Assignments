package NGTAssignments;
import java.util.Scanner;
public class DemoOnIfStatement {
	int a,b,c;
	public static void main(String []args) {
		System.out.println("enter the values of a,b,c");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	if(a+b>=c) {
		System.out.println("print the c value" + c);
	}
}
	
}