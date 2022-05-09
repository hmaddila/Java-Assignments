package Assignments;
import java.util.Scanner;
public class DuplicateCharactersfromString {
	public static void main(String [] args) {
		System.out.println("Enter the characters into the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] String=str.toCharArray();
		System.out.println("Duplicate Characters in a String");
		for(int i = 0; i <String.length; i++) {    
			int count = 1;    
			for(int j = i+1; j <String.length; j++) {    
				if(String[i] == String[j] && String[i] != ' ') {    
					count++; 
					String[j]=0;
				}
			}
			if(count > 1 && String[i] != '0')    
				System.out.println(String[i]); 
}
	}
}