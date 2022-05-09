package NGTAssignments;
import java.util.Scanner;
public class ArraySum {
public static void main(String[]args) {
	int i; double sum=0;
	System.out.println("Enter the size of an array");
	Scanner sc = new Scanner(System.in);
	int size =sc.nextInt();
int [] array = new int[size];
System.out.println("Enter the numbers");
for(i=0; i<array.length;i++) {
	array [i] = sc.nextInt();
	
}
for(int j=0;j<array.length;j++) {
	sum+=array [j];
}
 double avg = sum/array.length;
System.out.format("Print the avg values: %.3f", avg);
}
}
