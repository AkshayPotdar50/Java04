package com.java.sprint2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Test1 {
	
	/*mode of elements in an
    array in Java, we need to count
     the frequency of each element and then
      find the element(s) with the highest frequency.*/

	public static void main(String[] args) {
		int[] arr= {10, 2, 5, 3 ,9, 1, 6, 4, 8, 7, 5, 5, 6};
		
		//count the freq of elements
		Map<Integer, Long> frequencyMap=new HashMap<>();
		IntStream.of(arr).forEach(num->frequencyMap.put(num , frequencyMap.getOrDefault(num, 0L)));
		OptionalInt maxFrequency=frequencyMap.values().stream().mapToInt(Long::intValue).max();
		
		if(maxFrequency.isPresent()) {
		
		}
	

	}
	
	private static void mostRepetedElement() {
		
	}

}
