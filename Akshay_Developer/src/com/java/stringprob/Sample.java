package com.java.stringprob;

import java.util.Arrays;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		firstNonRepeatingCharacter();
	}
	
	private static void firstNonRepeatingCharacter() {
		String temp="akshayaksh";
		System.out.println(Arrays.stream(temp.split(""))
				.filter(str->temp.indexOf(str) ==temp.lastIndexOf(str))
				.findFirst().orElse(""));
		
	}
	
	

}
