import java.util.*;
import java.io.*;
public class Example1202 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.print("Input Section: ");
		int section = input.nextInt();
		Header(section);
		showListStudent(section);
	}
	
	public static void showListStudent(int section) throws IOException {
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//List107.txt"));
		String temp = "";
		while ((temp=readFile.readLine()) != null ) {
			String[] data = temp.split("\t");
			int sec = Integer.parseInt(data[3]);
			String ID = data[0];
			String name = data[2];
			float midterm = Float.parseFloat(data[4]);
			float finalscore = Float.parseFloat(data[5]);
			if (sec == section) {
				System.out.println(ID + "\t" + name + "\t" + midterm + "\t" + finalscore + "\t" + findResult(midterm, finalscore));
			}
		}
	}
	
	public static String findResult(float Mid, float Final) {
		return (Mid+Final >= 40 ? "PASS" : "FAIL");
	}
	
	public static void Header(int section) {
		System.out.println("********************************************************************************");
		System.out.println("\t\t\tList of Data for Section " + section);
		System.out.println("********************************************************************************");
		
	}

}
