/* Welcome to the Employee Wage Computation Problem */

public class EmployeeWageComputationProblem {
		public static void main(String[] args) {
		System.out.println("Welcome to the Employee Wage Computation Problem");
			// Constants
		int IS_EMPLOYEE_FULL_TIME = 1;
			// Computation involved to check the Employee 
		double employeeCheck = Math.floor(Math.random() * 10) % 2;
		if(employeeCheck == IS_EMPLOYEE_FULL_TIME){
			System.out.println("Employee is Present");
		}
		else{
			System.out.println("Employee is Absent");
		}
	}
}
