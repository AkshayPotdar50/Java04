package com.java.numbers;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter input number");
		int input=sc.nextInt();
		System.out.println(calculateFactorial(input));
		// TODO Auto-generated method stub

	}
	
	//Write a program to calculate the factorial of a number.
	public static long calculateFactorial(int input) {
		if(input <=0) {
			throw new IllegalArgumentException("the input should be greater than 0");
		}
		long factorial1=1;
		for(int i=1; i<=input;i++) {
			factorial1*=i;
		}
		return factorial1;
	}
	
	
	
	public static long calculateFactByRecurrsion(int input) {
		if(input <=0) {
			throw new IllegalArgumentException("the input should be greater than 0");
		}
		if(input== 0||input ==1) {
			return 1;
		}
		
		return input*calculateFactByRecurrsion(input-1);
	}

}
