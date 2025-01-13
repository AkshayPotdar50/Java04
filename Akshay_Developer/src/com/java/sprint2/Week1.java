package com.java.sprint2;

import java.util.HashMap;
import java.util.Map;

public class Week1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static String removeWhiteSpaces(String str) {
		return str.replaceAll("\\s+", "");
	}
	
	/*below method is for counting occurance of character in string*/
	public static Map<Character,Integer> findCharacterFrequency(String str){
		Map<Character,Integer> charCount= new HashMap<>();
		for(char c:str.toCharArray()) {
			if(Character.isLetterOrDigit(c)) {
				charCount.put(c, charCount.getOrDefault(c, 0)+1);
			}
		}
		return charCount;
	}
	
	 public static int findOccuranceOfCharacter(String str) {
		 for(int i=0; i<str.length(); i++) {
			 char ch=str.charAt(i);
			 if(str.indexOf(ch) ==str.lastIndexOf(ch)) {
				 return i;
			 }
			 
		 }
		 return -1;
	 }

}
