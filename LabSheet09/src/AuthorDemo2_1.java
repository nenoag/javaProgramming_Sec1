import java.util.Scanner;
public class AuthorDemo2_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Author[] authors = new Author[4];
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Information Author " + (i+1));
			System.out.println("-----------------------------------------");
			System.out.print("Input author name    : ");
            String name = input.nextLine();
            System.out.print("Input author e-mail  : ");
            String email = input.nextLine();
            System.out.println("-----------------------------------------");
            authors[i] = new Author(name, email);
        }

		System.out.println();
		System.out.println("1. " + authors[0]);
		System.out.println("2. " + authors[1]);
		System.out.println("3. " + authors[2]);
		System.out.println("4. " + authors[3]);
		
		
	}
}