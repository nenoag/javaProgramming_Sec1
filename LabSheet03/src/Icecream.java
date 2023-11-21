import java.util.*;
import javax.swing.*;
import java.text.*;

public class Icecream {

	public static void main(String[] args) {
		int option;
		do {
			option = Integer.parseInt(JOptionPane.showInputDialog("[1] Vanilla Flavor 10 B."
					+ "\n[2] Chocolate Flavor 15 B."
					+ "\nPress number to choose flavor: "));
		if (option != 1 && option !=2) {
				JOptionPane.showMessageDialog(null, "ERROR: Wrong choice!\nTry again...","ERROR",JOptionPane.ERROR_MESSAGE);
			}
		}while(option != 1 && option !=2);
		
		int totalprice = ((option==1) ? 10 : 15);
		
		int topping;
		topping = JOptionPane.showConfirmDialog(null, "Do you want to add topping?","Topping",JOptionPane.YES_NO_OPTION);
		
		int totalpricetopping = totalprice + ((topping == JOptionPane.YES_OPTION) ? 5:0);

		JOptionPane.showMessageDialog(null, "You choose " + ((option == 1) ? "Vanilla Flavor" : "Chocolate Flavor")
					+ "\nAnd " + ((topping == JOptionPane.YES_OPTION) ? "with topping":"no topping")
					+ "\nTotal price = " + totalpricetopping);
	
	}

}
