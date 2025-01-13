package com.java.sprint2;

import java.util.Arrays;

public class MoveEvenAndOdd {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12, 17, 70, 15, 22, 65, 21, 90};
		
		System.out.println("original array: "+Arrays.toString(arr));
		
		
		moveEvenOdd(arr);
		System.out.println("rearranged array:"+Arrays.toString(arr));

	}
	
	public static void moveEvenOdd(int[] arr) {
		//create two index variable
		int left=0;
		int right=arr.length-1;
		
		while(left <right) {
			while(left <right && arr[left] %2 ==0) {
				left++;
			}
			
			while(left < right && arr[right] %2 !=0) {
				right--;
			}
			
			if(left < right) {
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				
				left++;
				right--;
		}
		
		
		}
	}

}
