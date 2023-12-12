import javax.swing.*;
import java.util.*;
public class Example_503 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a sentence : ");
		String Message = scan.nextLine();
		while (!Message.endsWith(".")) {
			System.out.print("Input a sentence, again : ");
			Message = scan.nextLine();
		}
		System.out.println();
		int space = 0;
		for (int i = 0;i < Message.length();i++) {
			if(Message.charAt(i) == ' ') {
				space+=1;
			}
		}
		System.out.println("This sentence has " + space + " spacebar.");
		System.out.println("This sentence has " + (space+1) + " word.");
		
	}

}
