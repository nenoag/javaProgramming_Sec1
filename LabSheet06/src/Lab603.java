import java.util.*;
public class Lab603 {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Please enter your name, seperated by space.");
		String name = input.nextLine();
		String Firstname = name.substring(0, name.indexOf(' '));
		System.out.println(abbreviantName(name)+Firstname) ;
		
	}
	
	public static String abbreviantName(String name) {
		String names = "";
		char[] namae = name.toCharArray();
		for (int i = 0 ; i < name.length(); i++) {
			if (namae[i] == ' ') {
				names = names+(namae[i+1] + ".").toUpperCase();
			}
		}
		
//		String middle = (name.substring(name.indexOf(' ')+1,name.indexOf(' ')+2) + ".");
//		String last = (name.substring(name.lastIndexOf(' ')+1,name.lastIndexOf(' ')+2) + ".");
//		String first = (name.substring(0, name.indexOf(' ')));
//		names = middle.toUpperCase()+last.toUpperCase()+first;	
//      ง่ายกว่าแต่ไม่รู้ว่าถูกไหม//		
		
		return names;
		
	}

}
