package com.java.sprint2;

public class Queue implements QyeueInf{
	
	int arr[] = new int[100];
	int head=0;
	int tail=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addQ(int elem) {
		// TODO Auto-generated method stub
		if(tail==100) {
			System.out.println("Queue is full");
		}else {
			arr[tail++]=elem;
		}
		
	}

	@Override
	public int deleteQ() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

}
