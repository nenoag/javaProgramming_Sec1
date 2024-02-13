import java.util.*;
import java.io.*;
public class ATMBanking {

	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter account number  :");
		String accountNumber = input.nextLine();
		//check yang how a
		
		System.out.print("Enter password  :");
		String password = input.nextLine();
		while (password.length() != 4 ) {
			System.out.print("Enter password, again  :");
			password = input.nextLine();
		}
		
		System.out.print("Enter money : ");
		int money = input.nextInt();
		
		while(money < 0) {
			System.out.print("Enter money, again : ");
			money = input.nextInt();
		}
		ATMChecking atm = new ATMChecking(accountNumber, password, money);
		if (atm.checkBookBank()==false) {
			System.out.println("Sorry, your id or password is wrong, or your amount not enough.");
		} else if (atm.checkBookBank()==true) {
			atm.show();
		}

		
	}

}
