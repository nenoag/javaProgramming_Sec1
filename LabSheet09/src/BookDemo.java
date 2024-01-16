import java.util.Scanner;
public class BookDemo {

	public static void main(String[] args) {
		Book b1 = new Book();
		Scanner input = new Scanner(System.in);
		System.out.print("Input book title   : ");
		String title = input.nextLine();
		b1.setTitle(title);
		
		System.out.print("Input book price   : ");
		float price = input.nextFloat();
		b1.setPrice(price);
		
		System.out.print("Input publish year : ");
		int year = input.nextInt();
		b1.setPublishyear(year);
		System.out.println();
		System.out.println(b1);
	}
	
	

}
