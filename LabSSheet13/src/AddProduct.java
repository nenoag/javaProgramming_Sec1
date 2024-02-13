import java.io.*;
import java.util.*;

public class AddProduct {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		
		//FileWriter filename = new FileWriter("d://txtFile//product.txt",true);
		//PrintWriter writeFile = new PrintWriter(filename);
		
		PrintWriter writeFile = new PrintWriter(new FileWriter("d://txtFile//product.txt",true));
		
		System.out.print("Product Id: ");
		String proId = input.next();
		System.out.print("Product Name: ");
		String proName = input.next();
		System.out.print("Product Unit: ");
		int unit = input.nextInt();
		System.out.print("Product Price: ");
		float proPrice = input.nextFloat();
		
		//insert(save) all data to file(after previous data)
		
		writeFile.println(proId+","+proName+","+unit+","+proPrice);
		System.out.println("Write file already...");
		writeFile.close();
		
		
	}

}
