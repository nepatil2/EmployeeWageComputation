package com.bridgelabz.problem;

public class EmployeeWageComputation6 {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 100;


	public static void main(String[] args) {
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;

		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS){
			totalWorkingDays++ ;
			int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
			switch (empCheck) {
				case IS_FULL_TIME:
					System.out.println("Employee is present for FULL TIME");
					empHrs = 8;
					break;
				case IS_PART_TIME:
					System.out.println("Employee is present for PART TIME");
					empHrs = 4;
					break;
				default:
					System.out.println("Employee is Absent");
					empHrs = 0;
			}

			totalEmpHrs += empHrs ;
			System.out.println("Days:" +totalWorkingDays+  "  Emp Hr:"+empHrs);
		}
		int totalempWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println("Total Emp Wage = "+totalempWage);
	}
}