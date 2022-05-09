package Assignments;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the year");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if (((n % 4 == 0) && (n % 100!= 0)) || (n%400 == 0)) {
			System.out.println("Given year is a leap year");
		}
		else {
			System.out.println("Given year is not a leap year");
	}

}
}

