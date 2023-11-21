import java.util.Scanner;
public class Example2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input number : ");
		int num = input.nextInt();
		int num2;
		
		/**while(true) {
			System.out.print("Input number : ");
			num2 = input.nextInt();
			
			if (num2 > num) {
				num = num2;
			}
			else {
				System.out.print("\nBYE BYE");
				break;
			} 
		} **/
		
		do {
			System.out.print("Input number : ");
			num2 = input.nextInt();
		}while(num2 > num);
		
		System.out.print("\nBYE BYE");
	}

}
