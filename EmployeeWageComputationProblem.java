/* Welcome to the Employee Wage Computation Problem */

public class EmployeeWageComputationProblem {
		public static void main(String[] args) {
		System.out.println("Welcome to the Employee Wage Computation Problem");
			// Constants
		int IS_EMPLOYEE_FULL_TIME = 1;
	 	int EMP_RATE_PER_HOUR = 20;
		int empHrs = 0;
		int empWage = 0;	
			// Computation involved to check the Employee 
		double employeeCheck = Math.floor(Math.random() * 10) % 2;
	
		if(employeeCheck == IS_EMPLOYEE_FULL_TIME){
			empHrs = 8;
		}
		else{
			empHrs = 0;
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " + empWage);
	}
}
