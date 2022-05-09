package NGTAssignments;
import java.util.Scanner;
public class Student {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int rollno;
		int idcardno;
		int age;
		System.out.println("Enter the name of the student");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		System.out.println("Enter the rollno of the student");
		rollno=sc.nextInt();
		System.out.println("Enter the idcardno");
		idcardno=sc.nextInt();
		System.out.println("Enter the age");
		age = sc.nextInt();
		System.out.println("name ="+name+", rollno="+rollno+", idcardno="+idcardno+", age="+age);
		
	}
}


