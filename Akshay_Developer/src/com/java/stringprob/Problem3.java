package com.java.stringprob;
import java.util.*;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sample string to find maximum occuring character";
		
		Map<Character, Integer> map= new HashMap<>();
		
		for(char ch:str.toCharArray()) {
			if(ch !=' ') {
			map.put(ch, map.getOrDefault(ch, 0)+1);
			}
		}
		
		//for finding maximum occuring character
		char maxchar=' ';
		int maxcount=0;
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue() >maxcount) {
				maxchar=entry.getKey();
				maxcount=entry.getValue();
			}
		}
		System.out.println("maximum occuring character is:"+ maxchar + "frequency"+maxcount);

	}

}
