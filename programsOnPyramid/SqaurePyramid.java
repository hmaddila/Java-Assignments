package programsOnPyramid;
import java.util.Scanner;
public class SqaurePyramid {
public static void main(String []args) {
	System.out.println("Enter the number of rows");
	Scanner sc=new Scanner(System.in);
	int row=sc.nextInt();
	for(int i=0;i<row;i++) {
		for(int j=0;j<row;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
