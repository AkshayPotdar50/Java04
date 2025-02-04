package com.java.numbers;

public class PrimeChecker {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2)
		 {
			return false; // 0 and 1 are not prime numbers
		}

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Found a divisor, not a prime
            }
        }
        return true; // Prime number
    }

    // Method to check and classify numbers
    public static void checkNumberType(int num) {
        if (num < 2) {
            System.out.println(num + " is neither prime nor composite.");
        } else if (isPrime(num)) {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is a Composite number.");
        }
    }

    // Main method to test the program
    public static void main(String[] args) {
        int[] testNumbers = {0, 1, 2, 5, 10, 17, 20, 23, 25, 29, 30};

        for (int num : testNumbers) {
            checkNumberType(num);
        }
    }
}

