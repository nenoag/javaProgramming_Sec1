import java.util.*;
public class TestPiggyBank {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PiggyBank pb = new PiggyBank();
		System.out.println("Money Total : " + pb.getTotal());
		System.out.print("Please difine size of PiggyBank:");
		int size = input.nextInt();
        pb.setPiggyBank(size);
        System.out.println("Size of your PiggyBank:" + pb.size);
        System.out.println();
        
        int choice;
        int money;
        while(true) {
        	showMenu();
            System.out.print("Please select Menu[1-5] : ");
            choice = input.nextInt();
            
            if (choice == 1) {
            	System.out.print("Insert 1 Baht Money: ");
            	money = input.nextInt();
            	pb.addOne(money);
            } else if (choice == 2) {
            	System.out.print("Insert 2 Baht Money: ");
            	money = input.nextInt();
            	pb.addTwo(money);
            } else if (choice == 3) {
            	System.out.print("Insert 5 Baht Money: ");
            	money = input.nextInt();
            	pb.addFive(money);
            } else if (choice == 4) {
            	System.out.print("Insert 10 Baht Money: ");
            	money = input.nextInt();
            	pb.addTen(money);
            } else if (choice == 5) {
            	System.out.println("Bye Bye");
            	break;
            }
            System.out.println("Money Total : " + pb.getTotal());
            System.out.println();
        }
	}
	
	public static void showMenu() {
		System.out.println("========================");
        System.out.println("Menu of PiggyBank");
        System.out.println("========================");
        System.out.println("[1] one baht."
        					+ "\n[2] two baht."
        					+ "\n[3] five baht."
        					+ "\n[4] ten baht."
        					+ "\n[5] Exit.");
        System.out.println("========================");
	}
}
