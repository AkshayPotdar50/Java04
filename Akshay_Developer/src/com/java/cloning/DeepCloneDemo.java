package com.java.cloning;

class Address2 implements Cloneable {
    String city;

    Address2(String city) {
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Address(this.city);  // Create a new object
    }
}

class Person2 implements Cloneable {
    String name;
    Address address;

    Person2(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person clonedPerson = (Person) super.clone();
        clonedPerson.address = (Address) this.address.clone();  // Deep copy
        return clonedPerson;
    }
}

public class DeepCloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("New York");
        Person person1 = new Person("John", address);

        // Deep Cloning
        Person person2 = (Person) person1.clone();

        // Changing the address in cloned object
        person2.address.city = "Los Angeles";

        System.out.println("Person 1 Address: " + person1.address.city);
        System.out.println("Person 2 Address: " + person2.address.city);
    }
}
