/* Welcome to the Employee Wage Computation Problem */

public class EmployeeWageComputationProblem {

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	//public static final int EMP_RATE_PER_HOUR = 20;
	//public static final int NUM_OF_WORKING_DAYS = 20;
	//public static final int MAX_HRS_IN_MONTH = 100;

	public static void computeEmployeeWage(String company, int empRate, int numOfWorkingDays, int maxHrs) {
		// variables
		int empHrs = 0, totalWorkingDays = 0, totalEmpHrs = 0;	
		// computation
		while(totalEmpHrs <= maxHrs && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
			int employeeCheck = (int)Math.floor(Math.random() * 10) % 3;
			// Check whether Employee is working as a full time or part time or not working.
			switch (employeeCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;	
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#: "+ totalWorkingDays +"Emp Hr: "+empHrs);
		}
		int totalEmpWage = totalEmpHrs * empRate;
		// Total Employee Wage for the hours Employee has worked
		System.out.println("Total Emp Wage for Company "+company+" is: "+ totalEmpWage);
	}

	public static void main(String[] args){
		System.out.println("Welcome to the Employee Wage Computation Problem");
		// Compute the daily wage of the Employee of the respective company 
		computeEmployeeWage("DMart", 20, 2, 10);
		System.out.println();
		computeEmployeeWage("JioMart", 10, 4, 40);
	}
}
