package com.wipro.oop;

public class BirdSpecies extends AnimalBase {
    public BirdSpecies(String animalName) {
        super(animalName);
    }

    @Override
    public void makeSound() {
        System.out.println(animalName + " chirps.");
    }

    @Override
    public void move() {
        System.out.println(animalName + " flies in the sky.");
    }
}
