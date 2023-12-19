import java.util.*;
public class Lab604 {
	static Scanner input = new Scanner(System.in);
	static String studentId,subId;
	static int subjectId;
	public static void main(String[] args) {
		inputStudent();
	}
	
	public static void inputStudent() {
		do {
			System.out.print("Enter Student Id: ");
			studentId = input.next();
			System.out.print("Enter Subject Id: ");
			subjectId = input.nextInt();
			subId = subjectId + "";
		} while (!isLength(studentId,subId));
		System.out.println();
		displayData(isITStudent(studentId),isITSubject(subId));
	}
	
	public static boolean isLength(String stuid, String subid) {
		if (stuid.length()==10 && subid.length()==7) {
			return true;
		} else { 
			return false; 
		}
	}
	
	public static boolean isITStudent(String stuid) {
		if (stuid.substring(0,3).equals("211") && stuid.substring(3,6).equals("311")) {
			return true;
		} else return false;
	}
	
	public static boolean isITSubject(String subid) {
		if (subid.substring(0,2).equals("21") && subid.substring(4,5).equals("1")) {
			return true;
		} else return false;
	}
	
	public static void displayData(boolean stuid, boolean subid) {
		if (stuid == true) {
			System.out.println("Student id: " + studentId + " 1st year student in IT");
		} else {
			System.out.println("Student id: " + studentId + " is not 1st year student in IT");
		}
		
		if (subid == true) {
			System.out.println("Enroll in courses for Year 1");
		} else {
			System.out.println("Not enroll in courses for Year 1");
		}
	}

}
