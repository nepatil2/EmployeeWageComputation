package com.bridgelabz.problem;

public class EmployeeWageComputation {
	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;
		int empHrs = 0;
		int empWage = 0;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employee is present for FULL TIME");
			empHrs = 8;
		}
		else {
			System.out.println("Employee is ABSENT");
			empHrs = 0;
		}

		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Daily Wage = " + empWage);
	}
}