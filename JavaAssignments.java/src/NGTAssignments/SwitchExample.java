package NGTAssignments;

public class SwitchExample {

	public static void main(String[] args){
		int days=4;    
		String daysString=""; 
		switch(days){ 
		case 1: 
			System.out.println(daysString="1 - monday");
		break;
		case 2:
			System.out.println(daysString="2 - tuesday"); 
		break;
		case 3:
			System.out.println(daysString="3 - wednesday");
		break;
		case 4:
			System.out.println(daysString="4 -thursday");
		break;
		case 5:
			System.out.println(daysString="5 - friday");
		break;
		case 6:
			System.out.println(daysString="6 - saturday");
		break;
		case 7:
			System.out.println(daysString="7 - sunday");
		break;
	    default:System.out.println("Invalid Day!");  
		
		}
	}

}

