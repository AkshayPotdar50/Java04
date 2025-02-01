package com.java.cloning;

class Address implements Cloneable {
    String city;
    
    Address(String city) {
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }
}

class Person implements Cloneable {
    String name;
    Address address;  // Reference type field

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }
}

public class ShallowCloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("New York");
        Person person1 = new Person("John", address);

        // Shallow Cloning
        Person person2 = (Person) person1.clone();

        // Changing the address in cloned object
        person2.address.city = "Los Angeles";

        System.out.println("Person 1 Address: " + person1.address.city);
        System.out.println("Person 2 Address: " + person2.address.city);
    }
}

