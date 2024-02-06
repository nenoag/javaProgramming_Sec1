import java.util.*;
import java.io.*;
import java.time.LocalDate;
public class Lab1205 {

	public static void main(String[] args) throws IOException {
		Head();
		Scanner readFile = new Scanner(new File("d://txtFile//student.txt"));
		int i = 1;
		while (readFile.hasNext()) {
			String ID = readFile.next();
			readFile.next();
			String fname = readFile.next();
			String lname = readFile.next();
			double grade = Double.parseDouble(readFile.next());
			readFile.nextLine();
			String name = fname.substring(0, 1).toUpperCase()+ "."+lname;
			System.out.println(i + ".\t" + ID + "\t"+ Level(ID) + "\t" + name + "\t" + grade + "\t" + Status(grade));
			i++;
		}
		readFile.close();
	}
	
	public static String Level(String id) {
		int level = 22 - Integer.parseInt((id.substring(0,2)));
		return Integer.toString(level) + "th";
	}
	
	public static String Status(double grade) {
		if (grade > 2) {
			return "PASS";
		} else if (grade > 1 && grade < 2) { 
			return "CRITICAL";
		} else return "Retired";
	}
	
	
	public static void Head() {
		System.out.println("No.\tID\t\tLevel\tName\t\tGrade\tStatus");
		System.out.println("***********************************************************");
	}

}
