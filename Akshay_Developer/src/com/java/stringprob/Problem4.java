package com.java.stringprob;

public class Problem4 {

	public static void main(String[] args) {
		
	//different ways of reversing a string
		String s="akshay";
		s+="loser";
		s.trim();
		System.out.println(s);
		System.out.println("***************************************");
		
		StringBuilder sb= new StringBuilder(s);
		sb.append("no");
		System.out.println(sb.toString());
		System.out.println("**************************************");
		sb.reverse();
		System.out.println(sb);
		System.out.println("****************************************");
		
		StringBuffer sb1= new StringBuffer(s);
		sb1.reverse();
		System.out.println(sb1.toString());
		System.out.println("*****************************************");
		
		

	}
	
	

}
