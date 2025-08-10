package com.wipro.oop;

public abstract class AnimalBase {
    String animalName;

    public AnimalBase(String animalName) {
        this.animalName = animalName;
    }

    public void eat() {
        System.out.println(animalName + " is eating.");
    }

    public void sleep() {
        System.out.println(animalName + " is sleeping.");
    }

    public abstract void makeSound();

    public abstract void move();
}
