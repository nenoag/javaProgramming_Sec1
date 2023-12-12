import java.util.*;
public class Lab503 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Message : ");
		String Message = input.nextLine();
		if (Message.toLowerCase().indexOf("nichi") == -1) {
			System.out.println(Message);
		} else {
			System.out.println("Nichi is a sentence");
		}

	}

}
