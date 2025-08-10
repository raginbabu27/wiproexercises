package com.wipro.oop;

public class DogSpecies extends AnimalBase {
    public DogSpecies(String animalName) {
        super(animalName);
    }

    @Override
    public void makeSound() {
        System.out.println(animalName + " barks.");
    }

    @Override
    public void move() {
        System.out.println(animalName + " runs on four legs.");
    }
}
