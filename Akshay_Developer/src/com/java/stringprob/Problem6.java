package com.java.stringprob;

public class Problem6 {

	public static void main(String[] args) {
		

	}
	
	//below are problems on array
	public static int[] moveZerosToLeft(int[] nums) {
		int insertPos=nums.length-1;
		for(int i=nums.length-1; i>=0; i--) {
			if(nums[i] !=0) {
				nums[insertPos--]=nums[i];
			}
		}
		while(insertPos >=0) {
			nums[insertPos--]=0;
		}
		return nums;
	}
	
	public static int[] moveZerosToRight(int[] nums) {
		int insertPos=0;
		for(int num:nums){
			if(num !=0) {
				nums[insertPos++]=num;
			}
		}
		while(insertPos <nums.length) {
			nums[insertPos++]=0;
		}
		return nums;
	}
	
	

}
