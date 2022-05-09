package NGTAssignments;
import java.util.Scanner;
public class FibonacciSeries {
		public static void fibonacciSequence(int n){
			int n1 = 1, n2 = 1,n3;
			System.out.print(n1+" "+n2);
			for(int i=2; i<n; i++){
				n3 = n1+n2;
				if(n3<n){
					System.out.print(" "+n3);
					n1 = n2;
					n2 = n3;
				}
			}
		}
		public static void main(String[] args) {
			System.out.print("Enter the number:");
			Scanner inp = new Scanner(System.in);
			int n = inp.nextInt();
			fibonacciSequence(n);
		}
	}



