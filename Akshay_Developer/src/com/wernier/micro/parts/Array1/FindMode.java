package com.wernier.micro.parts.Array1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindMode {

	public static void main(String[] args) {
		
		 int[] arr = {1, 3, 2, 3, 4, 2, 1, 3, 3};
		 int[] arr2 = {1, 3, 0, 8, 4, 0, 5, 0, 3};
	        
	        System.out.println("Mode: " + findMode(arr));
	
	       
	        
	        //find range of array i.e find mim and max element in array
	        int min=Arrays.stream(arr).min().orElseThrow(IllegalArgumentException::new);
	        int max=Arrays.stream(arr).max().orElseThrow(IllegalArgumentException::new);
              
	        //find Average of array
	        double meanOrAvearage=Arrays.stream(arr).average().orElseThrow(IllegalArgumentException::new);
	        
	        //find intersection and union of two arrays
	        Set<Integer> set1=Arrays.stream(arr).boxed().collect(Collectors.toSet());
	        Set<Integer> set2=Arrays.stream(arr2).boxed().filter(set1::contains).collect(Collectors.toSet());
	        System.out.println(set2);
	        
	        
	        //union
	        Set<Integer> union= new HashSet<>();
	        union.addAll(Arrays.stream(arr).boxed().collect(Collectors.toSet()));
	        union.addAll(Arrays.stream(arr2).boxed().collect(Collectors.toSet()));
             System.out.println(union);
             
             int[] a1=moveZerosToRight(arr2);
             System.out.println(Arrays.toString(a1));
             int[] a2=moveZerosToLeft(arr2);
             System.out.println(Arrays.toString(a2));
             
             

	}
	
	//simple way
	public static int findMode(int[] arr) {
		HashMap<Integer, Integer> freqMap=new HashMap<>();
		int mode=arr[0],maxCount=0;
		
		for(int num :arr) {
			int count=freqMap.getOrDefault(num, 0)+1;
			freqMap.put(num, count);
			
			if(count >maxCount) {
				maxCount=count;
				mode=num;
			}
			
			
		}
		
		return mode;
	}
	
	public static int[] moveZerosToRight(int[] nums) {
		int insertPos=0;
		for(int num:nums) {
			if(num !=0) {
				nums[insertPos++]=num;
			
			}
		}
			while(insertPos <nums.length) {
				nums[insertPos++]=0;
			}
			
			return nums;
		
		
	}
	
	public static int[] moveZerosToLeft(int[] nums) {
		int insertPos=nums.length-1;
		for(int i=nums.length-1; i>=0; i--) {
			if(nums[i] !=0) {
				nums[insertPos--]=nums[i];
			}
		}
		while(insertPos>=0) {
			nums[insertPos--]=0;
		}
		
		return nums;
	}

}
