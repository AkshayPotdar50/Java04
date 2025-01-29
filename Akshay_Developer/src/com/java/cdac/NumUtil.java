package com.java.cdac;

public class NumUtil {
	
	static double getPower(int n, double x) {
		return Math.pow(n, x);
	}

	static long getFactorial(int num) {
		if (num==0) {
			return 1;
		}
		return num*getFactorial(num-1);
	}
	
	static boolean isPrime(int num) {
		boolean prime = true;
		for (int i=2; i<=num/2; i++) {
			if (num%i == 0) {
				prime = false;
				break;
			}		
		}
		if(num==0) {
			return false;
		} else if (prime) {
			return true;
		} else {
			return false;
		}
	}
	
	static boolean isEven(int num) {
		if(num%2==0) {
			return true;
		}
		return false;
	}
	
	static boolean isOdd(int num) {
		if(num%2!=0) {
			return true;
		}
		return false;
	}
}
