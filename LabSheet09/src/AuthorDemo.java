import java.util.Scanner;
public class AuthorDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input author name    : ");
		String name = input.nextLine();
		
		System.out.print("Input author e-mail  : ");
		String email = input.next();

		
		System.out.print("Input author gender  : ");
		char gender = input.next().charAt(0);
		
		Author a1 = new Author(name,email,gender);

		System.out.println();
		System.out.println(a1);
	}

}
