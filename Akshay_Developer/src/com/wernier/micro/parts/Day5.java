package com.wernier.micro.parts;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str3="akshay is bad teacher";
		String result=str3.replaceAll("\\s", "_");
		System.out.println(result);

	}
	
	//check if string is palindrome
	
	public static boolean checkPalindrome(String str) {
		for(int i=0; i<str.length()/2; i++) {
			if(str.charAt(i) != str.charAt(str.length()-i-1)) {
				return false;
			}
			}
		return true;
	}
	
	//check anagrams
	public static boolean checkAnagrams(String str1, String str2) {
		char[] array1=str1.toCharArray();
		char[] array2=str2.toCharArray();
		
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		return Arrays.equals(array1, array2);
		
	}
	
	
	//method to remove vowel from string
	  public static String removeVowels(String str) {
	        return str.chars()
	                  .filter(c -> !("AEIOUaeiou".indexOf(c) >= 0)) // Optimized check
	                  .mapToObj(c -> String.valueOf((char) c))
	                  .collect(Collectors.joining());
	    }
	  
	  public static String removeCansonant(String str) {
		  return str.chars()
				  .filter(c ->("AEIOUaeiou").contains(String.valueOf((char)c)))
				  .mapToObj(c->String.valueOf((char)c))
				  .collect(Collectors.joining());
		  
	  }
	  
	  public static String toUpperCaseHalf(String str) {
		  
		  int mid=str.length()/2;
		  StringBuilder result= new StringBuilder();
		  for(int i=0; i<str.length();i++) {
			  if(i<mid) {
				  result.append(Character.toUpperCase(str.charAt(i)));
			  }else {
				  result.append(Character.toLowerCase(str.charAt(i)));
			  }
			  }
		  return result.toString();
	  }
	  
	  public static String convertEverySecond(String str) {
		  StringBuilder result=new StringBuilder();
		  for(int i=0; i<str.length();i++) {
			  char ch=str.charAt(i);
			  if(i%2 ==0) {
				  result.append(Character.toUpperCase(str.charAt(i)));
			  }else {
				  result.append(Character.toLowerCase(str.charAt(i)));
			  }
			  
			  
		  }
		  return result.toString();
	  }
	  
	 
	  
	  public static String toUpperCaseHalfStream(String str) {
		  int mid=str.length()/2;
		  return IntStream.range(0, str.length()).mapToObj(i->i<mid ?
				  Character.toUpperCase(str.charAt(i)):
					  Character.toTitleCase(str.charAt(i))).map(String::valueOf).collect(Collectors.joining());
				  
	  }

}
