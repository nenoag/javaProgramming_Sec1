import java.util.*;
import java.io.*;
public class Lab1203 {

	public static void main(String[] args) throws IOException {
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//BookData.txt"));
		String temp = "";
		int countBook = 0, i = 1;
		while((temp=readFile.readLine()) != null) {
			String[] data = temp.split("\t");
			String bookname = data[0];
			String name = data[1];
			String rating = data[2];
			String year = data[5];		
			System.out.println(i+"."+bookname + " (" + name + "), Rating " + rating + " publish on " + year);
		countBook++;
		i++;
		}
		
		System.out.println("==========================================");
		System.out.println("Total book = " + countBook);
		
		readFile.close();
		
	}

}
