/* Welcome to the Employee Wage Computation Problem */

public class EmployeeWageComputationProblem {
		public static void main(String[] args) {
		System.out.println("Welcome to the Employee Wage Computation Problem");
		int IS_PART_TIME = 1;
		int IS_FULL_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;
		int empHrs = 0;
		int empWage = 0;	
			// Computation involved to check the Employee 
		double employeeCheck = Math.floor(Math.random() * 10) % 3;
	
		if(employeeCheck == IS_FULL_TIME){
			empHrs = 8;
			// Full time work of the employee as 8 hours.
		}
		else if (employeeCheck == IS_PART_TIME){
			empHrs = 4;
			// Part time hour for the employee as 4 hours.
		}
		else{
			empHrs = 0;
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " + empWage);
	}
}
