package com.java.stringprob;

public class DeadlockAndLivelock {
	private static final Object lock1= new Object();
	private static final Object lock2= new Object();
	
	private static int sharedResource=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1= new Thread(()->{
			synchronized(lock1) {
				System.out.println("thread1 holding lock1");
				try {
					Thread.sleep(100L);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("thread1 waiting for lock2");
				synchronized(lock2) {
					sharedResource++;
					System.out.println("thread1 holding lock2");
				}
			}
		});
		
		
		Thread thread2= new Thread(()->{
			synchronized(lock2) {
				System.out.println("thread2 holding lock1");
				try {
					Thread.sleep(100L);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("thread2 waiting for lock2");
				synchronized(lock1) {
					sharedResource++;
					System.out.println("thread2 holding lock2");
				}
			}
		});
		
		thread1.start();
		thread2.start();

	}

}
