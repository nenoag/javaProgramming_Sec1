import java.util.*;
import java.text.*;
public class EmployeeDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat w = new DecimalFormat("#,###.00");
		
		System.out.print("Input employee id     : ");
		String id = input.nextLine();
		System.out.print("Input employee name   : ");
		String name = input.nextLine();
		System.out.print("Input employee salary : ");
		double salary = input.nextDouble();
		
		Employee e1 = new Employee(id,name,salary);
		System.out.print("Input employee sales  : ");
		double sales = input.nextDouble();
		
		e1 = new Sales();
		Sales s1 = new Sales(id,name,sales);
		
		System.out.println(s1);
		System.out.println("Total salary " + e1.getSalary() + " baht.");
		
		
	}

}
