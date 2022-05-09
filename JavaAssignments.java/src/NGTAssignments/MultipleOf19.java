package NGTAssignments;
import java.util.Scanner;
public class MultipleOf19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number upto where the numbers to be to be printed");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) 
		{
			if(i%19==0 && i%2!=0) {
				System.out.println("the odd numbers which are divisible"+i);

			}
		}
	}
}