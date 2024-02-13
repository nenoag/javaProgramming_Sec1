import java.io.*;
import java.util.*;

public class SentenceText {

	public static void main(String[] args) throws IOException {
		// create object for write data to file
		PrintStream writeFile = new PrintStream((new File("d://txtFile//sentence.txt")));
		
		// create object for input data from keyboard
		Scanner input = new Scanner(System.in);
		
		int i = 1;
		
		while(true) { 
			System.out.print("Sentece:");
			String word = input.next();
			
			if(word.equalsIgnoreCase("stop")) { 
				break;
			}
			
			//save data to file
			writeFile.println(i+":"+ word);
			i++;
		}
		
		System.out.println("File is save!!");
		writeFile.close();
	}

}
