package com.wipro.oop;

public class HumanBeing extends AnimalBase {
    public HumanBeing(String animalName) {
        super(animalName);
    }

    @Override
    public void makeSound() {
        System.out.println(animalName + " says: Hello!");
    }

    @Override
    public void move() {
        System.out.println(animalName + " walks on two legs.");
    }
}
