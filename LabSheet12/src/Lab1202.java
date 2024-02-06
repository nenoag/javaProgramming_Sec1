import java.util.*;
import java.io.*;
public class Lab1202 {

	public static void main(String[] args) throws IOException {
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		Scanner input = new Scanner(System.in);
		System.out.print("Input: ");
		String inputmail = input.nextLine();
		boolean found = false;
		while (readFile.hasNext()) {
			readFile.next();
			readFile.next();
			String pass = readFile.next();
			String mail = readFile.next();
			if (mail.equals(inputmail)) {
				System.out.println("Your password is " + pass);
				found = true;
			}
		}
		readFile.close();
		if (found == false) {
			System.out.println("The data not found...");
		}
	}
}
