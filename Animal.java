package com.example.oop;

// Base class demonstrating Inheritance
public class Animal {
    protected String name;
    protected int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method to be overridden (Polymorphism)
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Derived class demonstrating Inheritance
class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    
    // Method Overriding (Polymorphism)
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
}

// Another derived class
class Cat extends Animal {
    private boolean indoor;
    
    public Cat(String name, int age, boolean indoor) {
        super(name, age);
        this.indoor = indoor;
    }
    
    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow! Meow!");
    }
}

// Main class to demonstrate OOP concepts
public class package {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 5, "Golden Retriever");
        Cat cat = new Cat("Whiskers", 3, true);
        
        dog.displayInfo();
        dog.makeSound();
        
        cat.displayInfo();
        cat.makeSound();
    }
}