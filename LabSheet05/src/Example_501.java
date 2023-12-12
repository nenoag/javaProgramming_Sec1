import java.util.Scanner;

public class Example_501 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String Message = "";
		String InputMessage;
		while(true) {
			System.out.print("Enter Word: ");
			InputMessage = input.next();
			if (InputMessage.equalsIgnoreCase("stop")){
				break;
			}
			Message += InputMessage + " ";

		}
		System.out.println(Message.toUpperCase());
	}

}