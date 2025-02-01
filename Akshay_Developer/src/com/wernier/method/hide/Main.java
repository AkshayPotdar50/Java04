package com.wernier.method.hide;

public class Main {

	public static void main(String[] args) {
		Parent.show();
		Child.show();
		
		Parent obj= new Child();
		obj.show();

	}

}
