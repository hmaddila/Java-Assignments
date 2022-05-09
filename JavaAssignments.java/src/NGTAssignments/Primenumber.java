package NGTAssignments;
import java.util.Scanner;
public class Primenumber {
	public static void main(String []args) {
		int a, count=0;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if(a==0 || a==1) {
			System.out.println("Given number is not a prime number");
		}
		else {
			for(int i=2;i<=a/2;i++) {
				if(a%i==0) {
					System.out.println("Given number is not a prime number");
					count=1;
					break;
				}	

			}
			if(count==0) {
				System.out.println("Given number is a prime number");
			}
		}
	}
}


