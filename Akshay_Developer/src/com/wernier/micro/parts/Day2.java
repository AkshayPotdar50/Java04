package com.wernier.micro.parts;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//join two strings without using + op
		String s1="akshay";
		String s2="potdar";
		StringBuilder sb1= new StringBuilder();
		sb1.append(s1);
		sb1.append(" ");
		sb1.append(s2);
		System.out.println(sb1.toString());
		System.out.println("**************************************************");
		
		//split the string with given delimiter
		
		String input = "apple,banana,cherry,grape";
        String delimiter = ",";

        // Split the string
        String[] substrings = input.split(delimiter);

        // Print the substrings
        for (String substring : substrings) {
            System.out.println(substring);
        }
        
        
        
        //count th occurances of given substring in main string
        
        String main="hello world , hello veryone, hello universe";
        String subString="hello";
        
        int count =0;
        int index=0;
        
        while((index=main.indexOf(subString, index)) != -1) {
        	count++;
        	index +=subString.length();
        }
        
        System.out.println("Occurances of \"" + subString+ ":"+count);
        
        
        
        /*Replace all occurrences of a target substring using the replaceAll method*/
        String input2 = "The quick brown fox jumps over the lazy dog";
        String target = "the";
        String replacement = "a";

        // Replace all occurrences (case-sensitive)
        String result = input2.replaceAll(target, replacement);

        System.out.println("Original String: " + input2);
        System.out.println("Modified String: " + result);
	}

}
