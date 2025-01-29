package com.java.lined;

public interface LinkedListInf {
	//we have to make a doubly linked list
	public void addAtFront(int element);
	public void addElementAtPosition(int element, int position);
	public int[] getAllElements();
	public int[] getAllElementsInReverse();
	public void deleteAll(int element);
	
}
