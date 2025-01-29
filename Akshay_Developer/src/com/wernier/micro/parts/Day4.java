package com.wernier.micro.parts;

import java.util.Comparator;
import java.util.stream.Collectors;

public class Day4 {

	public static void main(String[] args) {
	//their are two ways of reversing a string
		
		//by using inbuilt stringbuilder
		String s1="hi i am akshay";
		String reversed=new StringBuilder(s1).reverse().toString();
		System.out.println("********************************************");
		for(int i=0; i<s1.length();i++) {
			Character c=s1.charAt(i);
			if(s1.indexOf(c) != s1.lastIndexOf(c)) {
				System.out.println("first repeating is "+c);
			}
			
		}
		
		System.out.println(reversed);
		
		String reversed2=" ";
		
		for(int i = s1.length()-1; i>=0; i--) {
			reversed2+=s1.charAt(i);
		}
		
		System.out.println(reversed2);
		
		
		//smallest and largest number
		String s2="9834627843";
		String smallest=s2.chars().sorted().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
		String largest=s2.chars().boxed().sorted(Comparator.reverseOrder()).map(c->String.valueOf((char)c.intValue())).collect(Collectors.joining());
		
	

	}
	
	public static int findFirstRepetatingCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) != str.lastIndexOf(c)) {
                return i;
            }
        }
        return -1;
    }
	
	
	public static int findFirstNonReapeating(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                return i;
            }

        }
        return -1;
    }
	
	
	public static String convertTheString(String str){
        int mid=str.length()/2;
        StringBuilder result= new StringBuilder();
        for(int i=0; i< str.length(); i++){
             char ch=str.charAt(i);
             if(i<mid){
                 result.append(Character.toUpperCase(ch));
             }else{
                 result.append(Character.toLowerCase(ch));
             }
        }
        return result.toString();

    }

    //reverse the string using inbuilt function
public static String reverseTheString(String str){
    StringBuilder result= new StringBuilder(str);
    return result.reverse().toString();
}

//write function to capitalize every other character
public static String capitalizeEveryOther(String str){
    StringBuilder result= new StringBuilder();
    for(int i=0; i<str.length(); i++){
        char ch=str.charAt(i);
        if(i % 2 ==0){
            result.append(Character.toUpperCase(ch));
        }else{
            result.append(Character.toLowerCase(ch));
        }
    }
    return result.toString();
}

}
