package com.java.stringprob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray= {"akshay", "hibernate","spring", "microservices"};
		
         //another method to iterate hashmap is enhanced for loop
		HashMap<Integer, String> map= new HashMap<>();
		for(Map.Entry<Integer, String> entry:map.entrySet()) {
			Integer key=entry.getKey();
			String value=entry.getValue();
			System.out.println("key"+key+" "+"value"+value);
		}
	}
	//we can iterate hashmap by two ways
	public static List<String> iterateHashMap(HashMap<Integer,String> hashMap){
		
		List<String> valuesList=new ArrayList<>();
		Iterator<Map.Entry<Integer,String>> iterator=hashMap.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Map.Entry<Integer, String> entry=iterator.next();
			valuesList.add(entry.getValue());
		}
		return valuesList;
	}
	
	
	
	public static String convertTheString(String str) {
		int mid=str.length()/2;
		StringBuilder result= new StringBuilder();
		for(int i=0; i<str.length();i++) {
			char ch=str.charAt(i);
			if(i<mid) {
				result.append(Character.toUpperCase(ch));
			}else {
				result.append(Character.toLowerCase(ch));
			}
		}
		return result.toString();
	}

}
