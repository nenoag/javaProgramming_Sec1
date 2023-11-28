import java.util.Scanner;

public class Lab401 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input value of X : ");
		int x = input.nextInt();
		
		System.out.print("Input value of Y : ");
		int y = input.nextInt();
		
		if (y<x) {
			do {
				System.out.print("Input value of Y, again : ");
				y = input.nextInt();
			}while (y<x);
		}
		
		int newx = x;
		int sum = 0;
		int newy;
		
		System.out.println();
		
		for (int i = x; i<y; i++) {
			newy = i+1;
			sum = newx + newy;
			System.out.println(newx + " + " + newy + " = " + sum);
			newx = sum;
		}
	}
}
