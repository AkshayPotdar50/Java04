package com.java.stringprob;

import java.util.stream.Collectors;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	public static String capitalizeEveryThird(String str) {
		StringBuilder sb= new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			Character ch=str.charAt(i);
			if(i % 3== 0) {
				sb.append(Character.toUpperCase(ch));
			}else {
				sb.append(Character.toLowerCase(ch));
			}
		}
		return sb.toString();
		}
	
	
	
	public static String removeVowel(String str){
        StringBuilder result= new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char ch =str.charAt(i);
            if(!("AEIOUaeiou".indexOf(ch) ==-1)){
                result.append(ch);
            }
        }
        return result.toString();
    }

   
	
	
	//by using java 8
    public static String removeVowel1(String str){
        return str.chars()
                .mapToObj(c->(char)c)
                .filter(ch->"AEIOUaeiou".indexOf(ch) ==-1)
                .map(String::valueOf)
                .collect(Collectors.joining());

    }

}
