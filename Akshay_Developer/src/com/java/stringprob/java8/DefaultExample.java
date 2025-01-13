package com.java.stringprob.java8;

//Interface with a default method
interface DefaultExample {
 // Default method in interface - can be overridden in implementing classes
 default void defaultMethod() {
     System.out.println("This is a default method in the interface.");
 }
}