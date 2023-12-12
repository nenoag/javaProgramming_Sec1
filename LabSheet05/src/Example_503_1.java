import javax.swing.*;
public class Example_503_1 {

	public static void main(String[] args) {
		String Message = JOptionPane.showInputDialog("Input a sentence: ");
		while (!(Message.endsWith("."))) {
			Message = JOptionPane.showInputDialog("Input a sentence, again: ");
		}
		int space = 0;
		for (int i = 0;i < Message.length();i++) {
			if(Message.charAt(i) == ' ') {
				space+=1;
			}
		}
		JOptionPane.showMessageDialog(null, "This sentence has " + space + " spacebar."
				 + "\nThis sentence has " + (space+1) + " word.");
	}

}
