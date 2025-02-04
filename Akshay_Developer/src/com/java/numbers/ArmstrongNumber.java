package com.java.numbers;

public class ArmstrongNumber {

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num, sum = 0, digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits); // Raise digit to the power of total digits
            num /= 10;
        }

        return sum == originalNum;
    }

    // Main method to test different numbers
    public static void main(String[] args) {
        int[] testNumbers = {0, 1, 153, 9474, 9475, 9473, 370, 407};

        for (int num : testNumbers) {
            System.out.println(num + (isArmstrong(num) ? " is an Armstrong number." : " is not an Armstrong number."));
        }
    }
}

