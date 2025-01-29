package com.java.sprint2;

public class Main1 {
    public static void main(String[] args) {
    	
    	System.out.println(" +\"\"\"\"\"+ "
				+ "\n[| o o |]"
				+ "\n |  ^  | "
				+ "\n | '-' |"
				+ "\n +-----+");
        if (args.length < 3) {
            System.out.println("Please provide three integers as command-line arguments.");
            return;
        }
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = Integer.parseInt(args[2]);
            double avg = (a + b + c) / 3.0; // Use floating-point division for precision
            System.out.printf("Average: %.2f%n", avg); // Print average with 2 decimal points
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please ensure all arguments are integers.");
        }
    }
}
