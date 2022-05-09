package NGTAssignments;
import java.util.Scanner;
public class Concatenation {
	public static void main(String [] args) {
		int count=0;
		System.out.print ("enter the size of an array");
		Scanner sc =new Scanner(System.in);
		int size=sc.nextInt();
		int []a = new int[size];
		int []b = new int[size];
		System.out.print ("Enter the vlaues into the first matrix");
		for(int i=0;i<a.length;i++) {
				a[i]=sc.nextInt();
			}

		System.out.print ("Enter the values into the second matrix");
		for(int j=0;j<b.length;j++) {
				b[j]=sc.nextInt();	
			}
		
		int []c = new int[a.length+b.length];
		for(int k=0;k<a.length;k++) {
			c[k]=a[k];
			count++;
		}
		for(int k=0;k<b.length;k++) {
			c[count++] = b[k];
	}
	     for(int i = 0;i<c.length;i++) {
			System.out.print(c[i] + "  ");
		}
}
}
			
			
	
