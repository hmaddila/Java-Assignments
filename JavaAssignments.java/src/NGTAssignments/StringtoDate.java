package NGTAssignments;
import java.text.SimpleDateFormat;  
import java.util.Date;
import java.util.Scanner;
public class StringtoDate {
	public static void main(String []args)throws Exception {
		System.out.println("Enter the date string in dd/mm/yyyy formate" );
		Scanner sc= new Scanner(System.in);
		String d=sc.nextLine();
		Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(d);  
		System.out.println(d+"\t"+date1);  
	}
}
