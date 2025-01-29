package com.wernier.micro.parts;

class Engine1 {
    private String type;

    public Engine1(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class Car1 {
    private String model;
    private Engine engine; // Composition relationship

    public Car1(String model, String engineType) {
        this.model = model;
        this.engine = new Engine(engineType); // Engine is part of Car and cannot exist independently
    }

    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Engine Type: " + engine.getType());
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        Car1 car = new Car1("Chevrolet Camaro", "V6"); // Engine is created as part of Car

        car.displayDetails();
        // No standalone Engine object exists outside the Car
    }
}

