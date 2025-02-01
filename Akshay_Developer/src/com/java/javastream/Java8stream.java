package com.java.javastream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8stream {
	//below are the some useful codes
	
	public static void main(String[] args) {
		
		//find the longest and shortest string in array
	    String[] strArray = {"aksha", "hibernate", "spring", "microservices"};
	      String longest=Arrays.stream(strArray).reduce((str1, str2)->str1.length() >str2.length() ? str1 :str2).get();
	      String shortest=Arrays.stream(strArray).reduce((str1, str2)->str1.length() <str2.length() ? str1 :str2).get();
         
	      int[] numbers = new int[]{10, 20, 10, 23, 54, 74, 12};
	        double average = Arrays.stream(numbers).average().orElse(0.0);
	        System.out.println(average);
	        System.out.println("*********************************************");

	        System.out.println("****************\"find average of list\"********************");
	        List<Integer> list1=Arrays.asList(1, 2, 3, 4, 5);
	        double average1=list1.stream().mapToInt(Integer::intValue).average().orElse(0.0);
	        System.out.println(average1);
	        
	        int secondLargest = Arrays.stream(numbers).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1L).findFirst().orElse(-1);
	        System.out.println(secondLargest);
	        int secondSmallest=Arrays.stream(numbers).distinct().boxed().sorted().skip(1L).findFirst().orElse(-1);
	        System.out.println("*********************************************");
	        
	        
	        
	}
	
	public static String removeVowel1(String str){
        return str.chars()
                .mapToObj(c->(char)c)
                .filter(ch->"AEIOUaeiou".indexOf(ch) ==-1)
                .map(String::valueOf)
                .collect(Collectors.joining());

    }
	
	public static String removeCansonant(String str){
        StringBuilder result= new StringBuilder();
        for(char ch:str.toCharArray()){
            if("aeiouAEIOU".indexOf(ch) !=-1|| !Character.isLetter(ch)){
                result.append(ch);
            }

        }
        return result.toString();
    }
	
	
	
	
      
}