import java.util.*;
public class AuthorDemo2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] AuthorName = new String[4];
		String[] AuthorMail = new String[AuthorName.length];
		for (int i = 0; i<AuthorName.length;i++) {
			System.out.println("Information Author " + (i+1));
			System.out.println("-----------------------------------------");
			
			System.out.print("Input author name    : ");
			AuthorName[i] = input.nextLine();
			System.out.print("Input author e-mail  : ");
			
			AuthorMail[i] = input.nextLine();
			System.out.println("-----------------------------------------");		
		}
		
		System.out.println();
		
		for (int i = 0; i<AuthorName.length;i++) {
			System.out.println((i+1) + ". " + AuthorName[i] + " (" + AuthorMail[i] + ")");
		}
	}

}
