package com.java.stringprob;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray= {"akshay", "hibernate","spring", "microservices"};
		

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
