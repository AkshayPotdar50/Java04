package com.wernier.micro.parts;

import java.util.HashMap;

public class Day3 {

	public static void main(String[] args) {
		String input="sample string sample";
		
		//remove whitespaces and convert to lowercase for simplicity
		input=input.replaceAll("\\s", " ");
		
		HashMap<Character, Integer> charcountMap= new HashMap<>();
		
		for(char c: input.toCharArray()) {
			charcountMap.put(c, charcountMap.getOrDefault(c, 0)+1);
			
		}
		
		//find the maximum occuring character
		Character maxChar=' ';
		Integer maxCount=0;
		for(HashMap.Entry<Character, Integer> entry : charcountMap.entrySet()) {
			if(entry.getValue() >maxCount) {
				maxChar=entry.getKey();
				maxCount=entry.getValue();
			}
		}
		System.out.println("characater :"+maxChar+" occurs max that is :"+maxCount+"");

	}

}
