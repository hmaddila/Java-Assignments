package programsOnPyramid;
import java.util.Scanner;
public class RighttAnglePyramid {
	public static void main(String[] args) {
		int i,j;
		System.out.print("Enter the number of rows");
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		 for(i=0; i<row; i++) {
			  for(j=2*(row-i); j>=0; j--) {
				  System.out.print(" "); 
			  }
			  for(j=0; j<=i; j++)
	            {
	                // printing stars
	                System.out.print("* ");
	            }
	             
	            // ending line after each row
	            System.out.println();
	        }
		
	    
		 }
		}
	

