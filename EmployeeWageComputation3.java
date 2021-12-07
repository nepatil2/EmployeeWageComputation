package com.bridgelabz.problem;

public class EmployeeWageComputation3 {
	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;
		int empHrs = 0;
		int empWage = 0;
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employee is present for FULL TIME");
			empHrs = 8;
		}
		else if (empCheck == IS_PART_TIME) {
			System.out.println("Employee is present for PART TIME");
			empHrs = 4;
		}
		else {
			System.out.println("Employee is ABSENT");
			empHrs = 0;
		}

		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Daily Wage = " + empWage);
	}
}