import java.util.*;
import java.io.*;
public class Lab1204 {

	public static void main(String[] args) throws IOException {
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//BookData.txt"));
		Scanner input = new Scanner(System.in);
		System.out.print("Enter rating of books: ");
		double inputrating = input.nextDouble();
		System.out.println("--------------------------------------------------------------");
		int count = 0;
		int i = 1;
		String temp = "";
		while((temp=readFile.readLine())!=null) {
			String[] data = temp.split("\t");
			String bookname = data[0];
			String name = data[1];
			String rating = data[2];
			String review = data[3];
			if (Double.parseDouble(rating) >= inputrating) {
				System.out.println("Book " + i + ":" + bookname + " by " + name + " (" + review + ") reviews");
				count++;
			}
			i++;
		}
		readFile.close();
		System.out.println("--------------------------------------------------------------");
		System.out.println("There are " + count + " book get rating more than " + inputrating);
	}

}
