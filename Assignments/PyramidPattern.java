package Assignments;
import java.util.Scanner;
public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		System.out.print("Enter the number of rows");
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		for(i=0;i<row;i++) {

			for (j=row-i;j>1;j--)  {
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}
}
