package com.wernier.micro.parts;

class Engine{
	private String type;

	public Engine(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
	
	
	
	
}

class Car{
	private String model;
	private Engine engine;
	
	
	public Car(String model, Engine engine) {
		super();
		this.model = model;
		this.engine = engine;
	}
	
	public void displayDetails() {
		System.out.println("car model"+  model);
		System.out.println("Engine type"+  engine.getType());
	}
	
}

public class AggregationExample {

	public static void main(String[] args) {
		Engine engine= new Engine("v8");
		Car car= new Car("ford mustang",engine);
		
		car.displayDetails();

	}

}
