
package NGTAssignments;
import java.util.Scanner;public class Operators {
	public static void main(String [] args) {
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n1");
		n1 = sc.nextInt();
		System.out.println("Enter the value of n2");
		n2 = sc.nextInt();
				Boolean A = n1 > 5; //true
				Boolean B = n2 > 30; //false
				System.out.println(A||B);
	}
}


