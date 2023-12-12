import javax.swing.*;

public class Example_502 {

	public static void main(String[] args) {
		String mail = JOptionPane.showInputDialog("Input your e-mail: ");
		while (mail.startsWith("@") || mail.startsWith(" ")) {
			mail = JOptionPane.showInputDialog("Input your e-mail, again: ");
		}
		if ((mail.toLowerCase()).endsWith("hotmail.com") || (mail.toLowerCase()).endsWith("gmail.com")) {
			JOptionPane.showMessageDialog(null, "Your e-mail is " + mail.toLowerCase());
		} else {
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
		}
	}

}
