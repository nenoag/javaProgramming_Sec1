import java.io.*;
import java.util.*;

public class Example1201 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner readFile = new Scanner(new File("D://txtFile//MemberLogin.txt"));

		while(readFile.hasNext()) {
			String fname = readFile.next();
			String lname = readFile.next();
			String id = readFile.next();
			String email = readFile.next();
			
			System.out.println(fname + " " + "(" + email + ")");
		}
		
		readFile.close();
	}

}
