import java.text.DecimalFormat;

import javax.swing.*;
public class Example4 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		String productName = JOptionPane.showInputDialog("Input Product Name:");
	
		/*
		 * String strproductUnit = JOptionPane.showInputDialog("Input Product Unit:");
		 * int productUnit = Integer.parseInt(strproductUnit);
		 */
		
		int productUnit = Integer.parseInt(JOptionPane.showInputDialog("Input Product Unit:"));
		
		String strproductPrice = JOptionPane.showInputDialog("Input Price Per Unit:");
		float priceperUnit = Float.parseFloat(strproductPrice);
		
		float totalprice = priceperUnit * productUnit;
		float vat = totalprice + (totalprice * 7/100);
		
		JOptionPane.showMessageDialog(null,
						  "Total Price is " + frm.format(totalprice) + " baht."
						+ "\nAdd VAT 7% is " + frm.format(vat) + " baht.");
		
	}
	
}
