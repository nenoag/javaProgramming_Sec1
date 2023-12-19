import javax.swing.*;

public class Lab601 {

	public static void main(String[] args) {
		String mail = JOptionPane.showInputDialog("Input your e-mail");
		while (!checkEmail(mail)) {
			mail = JOptionPane.showInputDialog("Input your e-mail, again");
		}
		JOptionPane.showMessageDialog(null, "Your e-mail is " + mail.toLowerCase());

	}
	public static boolean checkEmail(String email) {
		String lmail = email.toLowerCase();
		if (lmail.endsWith("hotmail.com") || lmail.endsWith("gmail.com")) {
			if (lmail.indexOf(' ') == -1) {
				if (lmail.startsWith("@")) {
					return false;
				} else {
					return true;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}
