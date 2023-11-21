import javax.swing.*;
import java.text.*;
public class Example3 {

	public static void main(String[] args) {
		DecimalFormat w = new DecimalFormat("##.0");
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight: "));
		double height = Double.parseDouble(JOptionPane.showInputDialog("Input Height: "));
		height = height/100;
		double bmi = weight/(height*height);
		
		//way ของอาจาร
		String bmicata = "";
		
		if (bmi < 18.5) {
			bmicata = "You're Underweight";
		}
		else if (bmi >= 18.5 && bmi <= 24.9) {
			bmicata = "You're Normalweight";
		}
		else if (bmi >= 25 && bmi <= 29.9) {
			bmicata = "You're Overweight";
		}
		else if (bmi > 30) {
			bmicata = "You're Obesity";
		} 
		
		JOptionPane.showMessageDialog(null, "BMI = " + String.format("%.1f",bmi)
		+ "\nYou're " + bmicata ,"BMI",JOptionPane.WARNING_MESSAGE);
		
		///way2
		/*if (bmi < 18.5) {
			JOptionPane.showMessageDialog(null, "BMI = " + w.format(bmi)
					+ "\nYou're Underweight","BMI",JOptionPane.WARNING_MESSAGE);
		}
		else if (bmi >= 18.5 && bmi <= 24.9) {
			JOptionPane.showMessageDialog(null, "BMI = " + w.format(bmi)
					+ "\nYou're Normal-weight","BMI",JOptionPane.WARNING_MESSAGE);
		}
		else if (bmi >= 25 && bmi <= 29.9) {
			JOptionPane.showMessageDialog(null, "BMI = " + w.format(bmi)
					+ "\nYou're Overweight","BMI",JOptionPane.WARNING_MESSAGE);
		}
		else if (bmi > 30) {
			JOptionPane.showMessageDialog(null, "BMI = " + w.format(bmi)
					+ "\nYou're Obesity","BMI",JOptionPane.WARNING_MESSAGE);
		} */
	}

}
