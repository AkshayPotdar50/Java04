package com.java.stringprob.java8;

public class InterfaceExample {
    public static void main(String[] args) {
        // 1. Demonstrating default method
        DefaultExample defaultInstance = new ImplementationClass();
        defaultInstance.defaultMethod(); // Calls overridden method

        // 2. Demonstrating static method
        StaticExample.staticUtilityMethod(); // Direct call to static method in the interface
        
        // Static method cannot be accessed through an instance
        // DefaultExample.staticUtilityMethod(); // Uncommenting will cause a compilation error
    }
}