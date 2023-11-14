import java.text.DecimalFormat;
public class Example2 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		final double BUFFET = 299;
		int numberofCustomer = 5;
		double netprice = BUFFET * numberofCustomer;
		System.out.println("Buffet of "+numberofCustomer
				+ " customers is "+frm.format(netprice));
		double servicecharge = netprice + (netprice * 3/100);
		System.out.println("Add Service Charge 3% is "+frm.format(servicecharge));
		

	}

}