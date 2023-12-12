import java.util.*;
public class Lab501 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Full Name: ");
		String FullName = input.nextLine();		
		if (FullName.indexOf(' ') == -1) {
			System.out.println("Incorrect Name");
		}
		String FirstName = FullName.substring(0, FullName.indexOf(' '));
		String LastName = FullName.substring((FullName.indexOf(' ')+1));
		System.out.println("First Name: " + FirstName);
		System.out.println("Last Name: " + LastName);
	}

}
