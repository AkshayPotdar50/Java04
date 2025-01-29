package com.wernier.micro.parts.Array1;

import java.util.Arrays;
import java.util.Comparator;

public class StringArrayProblem {

	public static void main(String[] args) {
		String[] strArray = {"aksha", "hibernate", "spring", "microservices"};
        String longest;
        longest = Arrays.stream(strArray).reduce((str1, str2) -> str1.length() > str2.length() ? str1 : str2).get();
        String shortest;
        shortest = Arrays.stream(strArray).reduce((str1, str2) -> str1.length() < str2.length() ? str1 : str2).get();

        System.out.println(longest + " " + shortest);
        System.out.println("********************************************************");

        
 /*Sort array of strings alphabetically in ascending order:
Sort array of strings alphabetically in descending order:
Sort array of strings by length in ascending order:
Sort array of strings by length in descending order:
*/
        String[] sortedAlphaAsc=Arrays.stream(strArray).sorted().toArray(String[]::new);
        String[] sortedAlphaDesc=Arrays.stream(strArray).sorted(Comparator.reverseOrder()).toArray(String[]::new);
        
        String[] sortAscByLength=Arrays.stream(strArray).sorted(Comparator.comparing(String::length)).toArray(String[]::new);
        String[] sortedDescByLength=Arrays.stream(strArray).sorted(Comparator.comparing(String::length).reversed()).toArray(String[]::new);
        
        
        
        
        
	}

}
