package com.java.stringprob.java8;

//Implementation class demonstrating static and default methods
class ImplementationClass implements DefaultExample {

    // Overriding the default method
    @Override
    public void defaultMethod() {
        System.out.println("Overridden default method in the implementation class.");
    }

    // Class can use static method from the interface directly
    public void useStaticMethod() {
        StaticExample.staticUtilityMethod(); // Accessing static method from the interface
    }
}
