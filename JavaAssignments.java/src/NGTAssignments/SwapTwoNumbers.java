package NGTAssignments;
import java.util.Scanner;
public class SwapTwoNumbers {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of a");
		int a=sc.nextInt();
		System.out.println("Enter the values of b");
		int b=sc.nextInt();
		int c=a;
		a=b;
		b=c;
		System.out.println("Swaped values " + a+" , "+b );
	}
}
