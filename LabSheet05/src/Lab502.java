import java.util.Scanner;

public class Lab502 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String Message = scan.nextLine();
		while (!Message.endsWith(".")) {
			System.out.print("The sentence must end with full stop point : ");
			Message = scan.nextLine();
		}
		System.out.println();
		for (int i = 0;i < Message.length();i++) {
			if(Message.charAt(i) == ' ') {
				System.out.print("\n");
			} else {
				System.out.print(Message.charAt(i));
			}
		}
	}

}
