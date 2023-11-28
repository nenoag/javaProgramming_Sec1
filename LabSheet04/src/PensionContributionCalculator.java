import java.util.*;
public class PensionContributionCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int SALARY_CEILING = 6000;
		final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
		final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
		final double EMPLOYEE_RATE_55_TO_60 = 0.13;
		final double EMPLOYER_RATE_55_TO_60 = 0.13;
		final double EMPLOYEE_RATE_60_TO_65 = 0.075;
		final double EMPLOYER_RATE_60_TO_65 = 0.09;
		final double EMPLOYEE_RATE_65_ABOVE = 0.05;
		final double EMPLOYER_RATE_65_ABOVE = 0.075;
		
		int salary, age;
		int contributablesalary;
		double employeeContribution, employerContribution, TotalContribution;
		
		System.out.print("Enter the monthly salary: ");
		salary = input.nextInt();
		System.out.print("Enter the age: ");
		age = input.nextInt();
		
		if (salary > SALARY_CEILING) {
			contributablesalary = SALARY_CEILING;
		} else {
			contributablesalary = salary;
		}
		
		if (age <= 55) {
			employeeContribution = contributablesalary * EMPLOYEE_RATE_55_AND_BELOW;
			employerContribution = contributablesalary * EMPLOYER_RATE_55_AND_BELOW;
		} else if (age <= 60) {
			employeeContribution = contributablesalary * EMPLOYEE_RATE_55_TO_60;
			employerContribution = contributablesalary * EMPLOYER_RATE_55_TO_60;
		} else if (age <= 65) {
			employeeContribution = contributablesalary * EMPLOYEE_RATE_60_TO_65;
			employerContribution = contributablesalary * EMPLOYER_RATE_60_TO_65;
		} else {
			employeeContribution = contributablesalary * EMPLOYEE_RATE_65_ABOVE;
			employerContribution = contributablesalary * EMPLOYER_RATE_65_ABOVE;
		}
		TotalContribution = employeeContribution + employerContribution;
		
		System.out.printf("The employee's contribution is: $%.2f\n", employeeContribution);
		System.out.printf("The employer's contribution is: $%.2f\n", employerContribution);
		System.out.printf("The total contribution is: $%.2f\n", TotalContribution);
		
	}

}
