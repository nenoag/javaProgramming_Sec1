import java.io.*;
import java.util.*;

public class ATMChecking extends ATMData{
	private int money;
	private int balance;
	
	ATMChecking (String name, String password, int money) {
		super(name, password);
		this.money = money;
	}
	
	public boolean checkBookBank(){
		try {
			Scanner readFile = new Scanner(new File("d://ATMBookBank.txt"));
			while (readFile.hasNext()) {
				String name = readFile.next();
				String pass = readFile.next();
				balance = readFile.nextInt();
				if (name.equalsIgnoreCase(getID())&& pass.equalsIgnoreCase(getPass()) && balance > money) {		
					return true;
				}
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return false;
	}
	
	public void show() {
		int pan = money/1000;
		int haaroy = money%1000/500;
		int roys = money%1000%500/100;
		System.out.println("You drawing for " + money + " get"
				+ "\n\t1000 = " + pan 
				+ "\n\t500  = " + haaroy
				+ "\n\t100  = " + roys
				+ "\nYour balance is " + (balance-money) + " Baht.");
	}

}
