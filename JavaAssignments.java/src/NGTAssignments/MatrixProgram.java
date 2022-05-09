package NGTAssignments;
import java.util.Scanner;
public class MatrixProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of an array");
		Scanner sc = new Scanner(System.in);
		int size =sc.nextInt();
		int [][] a = new int[size] [size];
		int [][] b = new int[size] [size];
		System.out.println("Enter the values of 1st matrix");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				a [i][j] =sc.nextInt();	
			}
		}
		System.out.println("Enter the values of 2nd matrix");
		for(int h=0;h<b.length;h++) {
			for(int l=0;l<b.length;l++) {
				b[h][l] =sc.nextInt();

			}
		}
		int [][] c = new int[size][size];
		for(int s=0;s<a.length;s++) {
			for(int k=0;k<a.length;k++) {
				c[s][k] = a[s][k]+b[s][k];
				System.out.print(c[s][k] + "  ");
				
			}	
			System.out.println();

		} 

	}


}
