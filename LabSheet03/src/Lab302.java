import java.util.*;

public class Lab302 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input value of X : ");
		int x = input.nextInt();
		
		System.out.print("Input value of Y : ");
		int y = input.nextInt();
		
		do {
			System.out.print("Input value of Y, again : ");
			y = input.nextInt();
		}while (y<x);
	}
}
