import java.text.DecimalFormat;
import java.util.Scanner;
public class Lab101 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input Product Name    : ");
		String productName = input.nextLine();
		System.out.print("Input Product Unit    : ");
		int productUnit = input.nextInt();
		System.out.print("Input Price per unit  : ");
		double priceperUnit = input.nextDouble();
		System.out.println("-------------------------------------------");
		
		double totalprice = priceperUnit * productUnit;
		System.out.println("Total Price is " + frm.format(totalprice) + "baht.");
		
		System.out.println("-------------------------------------------");
		
		System.out.print("How many discount (%) : ");
		int discount = input.nextInt();
		double discountamount = totalprice * discount/100;
		double discountprice = totalprice - discountamount;
				
		System.out.println("-------------------------------------------");
		System.out.println("Discount from " + discount + "% \t" + frm.format(discountamount) + " baht." );
		System.out.println("Amount to be paid \t" + frm.format(discountprice) + " baht.");
		

	}

}