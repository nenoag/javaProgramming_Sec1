import javax.swing.*;
import java.text.*;
public class Example1 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		final int BUFFET = 299;
		
		int numberofcustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill?"));
		
		double discount,totalprice = 0;
		
		totalprice = BUFFET * numberofcustomer;
			
		int member;
		
		do {
			member = JOptionPane.showConfirmDialog(null, 
					"Total Price is " + frm.format(totalprice) + " baht."
					+ "\nDo you have a member card?");
		}while(member==JOptionPane.CANCEL_OPTION);
		
		if(member == JOptionPane.YES_OPTION) {
			discount = totalprice * 90/100;
			JOptionPane.showMessageDialog(null, 
					"Amount to be paid is " + frm.format(discount) + " baht.");
		}
		else if (member == JOptionPane.NO_OPTION){
			JOptionPane.showMessageDialog(null, 
					"Amount to be paid is " + frm.format(totalprice) + " baht.");
		}
	}

}
