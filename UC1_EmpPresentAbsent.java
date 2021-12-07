package com.bridgelabz.problem;

import java.util.Random;

public class UC1_EmpPresentAbsent {
	private static final double IS_PRESENT = 1;

	public static void main(String[] args){
	double empCheck =(Math.floor(Math.random() * 10)%2);
	double IS_PRESENT = 1;
	if(empCheck == IS_PRESENT)
		System.out.println("Employee is Present");
	else
		System.out.println("Employee is Absent");
	}
}
