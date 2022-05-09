package NGTAssignments;
import java.util.Scanner;
public class VowelsandConsonants {
public static void main(String []args) {
	
	System.out.println("Enter the sentence");
	Scanner sc=new Scanner(System.in);
	String str =sc.nextLine();
	int vCount=0,cCount=0;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ||str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U'){    
	vCount++;
	}
		 else if((str.charAt(i) >= 'a' && str.charAt(i)<='z') ||(str.charAt(i) >= 'A' && str.charAt(i)<='Z')) {
			 cCount++;
		 }
		
	}
	System.out.println("Number of vowels: " + vCount);    
    System.out.println("Number of consonants: " + cCount); 
}
}

