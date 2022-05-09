package NGTAssignments;
import java.util.Scanner;
public class PatternPrinting1 {

	public static void main(String[] args) {
		int i, j, introw;  
		java.util.Scanner sc=new Scanner(System.in);
		int row =sc.nextInt();
		for (i=0; i<row; i++)   
		{  
			for (j=2*(row-i); j>=0; j--)         
			{  
				System.out.print(" ");   
			}   
			for (j=0; j<=i; j++ )   
			{   
				System.out.print("* ");   
			}   
			System.out.println();   
		}   
	}   
}

