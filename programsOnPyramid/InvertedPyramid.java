package programsOnPyramid;
import java.util.Scanner;
public class InvertedPyramid {
	public static void main(String []args) {
		System.out.println("Enter the number of rows");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i = n; i >= 1; --i) {
			for(int space = 1; space <= n - i; ++space) {
				System.out.print("  ");
			}

			for(int j=i; j <= 2 * i - 1; ++j) {
				System.out.print("* ");
			}

			for(int j = 0; j < i - 1; ++j) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}
}

