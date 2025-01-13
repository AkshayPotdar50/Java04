package com.java.stringprob;

public class EqualityExample {
    public static void main(String[] args) {
        // Example 1: == with primitive types
        int a = 5;
        int b = 5;
        System.out.println("a == b: " + (a == b)); // true (values are compared)

        // Example 2: == with objects
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println("str1 == str2: " + (str1 == str2)); // false (different memory locations)

        // Example 3: equals() method
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true (content is compared)

        // Example 4: hashCode() method
        System.out.println("str1.hashCode(): " + str1.hashCode());
        System.out.println("str2.hashCode(): " + str2.hashCode()); // Same hash code for equal strings

        // Example 5: Custom class with default equals() and hashCode()
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);

        // Default equals() (reference comparison)
        System.out.println("person1 == person2: " + (person1 == person2)); // false
        System.out.println("person1.equals(person2): " + person1.equals(person2)); // false (default behavior)

        // Custom equals() and hashCode() in Person class
        PersonWithOverrides p1 = new PersonWithOverrides("Bob", 25);
        PersonWithOverrides p2 = new PersonWithOverrides("Bob", 25);

        System.out.println("p1.equals(p2): " + p1.equals(p2)); // true (logical equality)
        System.out.println("p1.hashCode() == p2.hashCode(): " + (p1.hashCode() == p2.hashCode())); // true
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class PersonWithOverrides {
    String name;
    int age;

    public PersonWithOverrides(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PersonWithOverrides that = (PersonWithOverrides) obj;
        return age == that.age && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() * 31 + age;
    }
}
