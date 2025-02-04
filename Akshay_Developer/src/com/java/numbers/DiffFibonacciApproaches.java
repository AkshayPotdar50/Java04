package com.java.numbers;

import java.util.Scanner;

public class DiffFibonacciApproaches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter the number");
		int input=sc.nextInt();
		generateFibonacci1(input);
		

	}
	
	public static void generateFibonacci1(int input) {
		
		int num1=0;
		int num2=1;
		
		System.out.println("fibonacci series for input"+input);
		System.out.print(num1+" "+num2);
		int i=2;
		while(i <= input) {
			i++;
			int temp=num1 + num2;
			num1=num2;
			num2=temp;
			System.out.print(" "+num2);
		}
		
	}

}
