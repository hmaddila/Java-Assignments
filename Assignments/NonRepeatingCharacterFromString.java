package Assignments;
import java.util.Scanner;
public class NonRepeatingCharacterFromString {
	public static void main(String []args) {
		System.out.println("Enter the characters into the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for(char ch:str.toCharArray()){
			if(str.indexOf(ch) == str.lastIndexOf(ch)) {
				System.out.println("non-repeating character:" + ch);
				break;
			}
		}
		
	}
}
