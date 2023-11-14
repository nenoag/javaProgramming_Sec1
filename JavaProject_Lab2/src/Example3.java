import java.util.*;
import java.text.*;
public class Example3 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input Product name : ");
		String productName = input.nextLine();
		System.out.print("Input product unit : ");
		int productUnit = input.nextInt();
		System.out.print("Price per unit : ");
		float priceperUnit = input.nextFloat();
		System.out.println(); 
		float totalprice = productUnit * priceperUnit;
		System.out.println("Total price is "+frm.format(totalprice) + " baht.");
		float vat = totalprice + (totalprice*7/100);
		System.out.println("Add VAT 7% is "+frm.format(vat) + " baht.");

	}

}