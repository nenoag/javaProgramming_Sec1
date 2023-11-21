import java.util.*;
import java.text.*;

import javax.swing.JOptionPane;
public class Withdawal {

	public static void main(String[] args) {
		Random rand = new Random();
		DecimalFormat b = new DecimalFormat("#,###");
		
		int balance = rand.nextInt(9) * 100000;
		
		int withdrawamount = Integer.parseInt(JOptionPane.showInputDialog("Your balance : " + b.format(balance) + "\nInput money to withdraw"));
		
		int pan = withdrawamount/1000;
		int haa = withdrawamount%1000/500;
		int roy = withdrawamount%1000%500/100;
		int leftover = withdrawamount%1000%500%100;
		
		if (withdrawamount > balance) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than balance ","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if (withdrawamount > 20000){
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than 20,000 ","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(leftover != 0){
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw " + leftover + " baht.","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else{ 
		JOptionPane.showMessageDialog(null, "You withdraw " + b.format(withdrawamount) + " baht." 
		+ "\n1,000 = " + pan
		+ "\n500 = " + haa
		+ "\n100 = " + roy); 
		}
	}

}
