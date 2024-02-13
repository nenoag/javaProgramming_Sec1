import java.io.*;
import java.util.Scanner;
public class SaveandOpen extends Employee {
	private String name;
	private String dept;
	
	public void insert() throws IOException {
		Scanner input = new Scanner(System.in);
		PrintStream writeFile = new PrintStream((new File("d://txtFile//employee.txt")));
		String answer;
		do {
			header();
			System.out.print("Enter name      : ");
			name = input.next();
			System.out.print("Enter department : ");
			dept = input.next();
			writeFile.println(name+"\t"+dept);
			System.out.print("Enter data again? : ");
			answer = input.next();
		}while(answer.equalsIgnoreCase("y"));
		
		
		
		writeFile.close();
	}
	
	public void read() {
		try {
			int i = 1;
			Scanner readFile = new Scanner(new File("d://txtFile//employee.txt"));
			boolean check = false;
			header();
			while (readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next();
				if (dept.equalsIgnoreCase(super.getDept())) {
					System.out.println(i+") "+name);
					check = true;
					i++;
				}
			}
			if (check==false) {
				System.out.println("Sorry, no dept : " + super.getDept() + " in file.");
			} else if (check == true) {
				header();
				System.out.println("Employee in dept " + super.getDept() + " is " + (i-1) + " person");
			}
		} catch(IOException e) {
			System.out.println("Sorry, file not found");
		}
		
	}
}
