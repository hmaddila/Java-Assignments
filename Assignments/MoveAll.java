package Assignments;
import java.util.Scanner;
public class MoveAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the size of an array");
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int [] num = new int[size];
		System.out.print("Enter the elements");
		int count=0;
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		int b[]=new int[size];
		for(int j=0;j<num.length;j++) {
			if(num[j]!=0) {
				b[count++]=num[j];
			}
	
			}
		while(count<num.length) {
			b[count++]=0;

		}
		for(int k=0;k<b.length;k++) {
			System.out.print(b[k]+" ");
		}
	}

}
