package Assignments;
import java.util.Scanner;
public class CharacterIsAlphabetorNot {
public static void main(String[] args) {
	System.out.println("Enter the Character");
	Scanner sc=new Scanner(System.in);
	char c=sc.next().charAt(0);
if( (c >= 'a' && c <= 'z')) {

}
else if(c >= 'A' && c <= 'Z'){
	System.out.println("It is a character");
}
else {
	System.out.println("It is not a character");
}
}
}
