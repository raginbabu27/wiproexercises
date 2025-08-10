package com.wipro.oop;

public class AnimalTestRun {
    public static void main(String[] args) {
        AnimalBase person = new HumanBeing("Rajesh");
        AnimalBase parrot = new BirdSpecies("Parrot");
        AnimalBase petDog = new DogSpecies("Max");

        person.eat();
        person.sleep();
        person.makeSound();
        person.move();

        parrot.eat();
        parrot.sleep();
        parrot.makeSound();
        parrot.move();

        petDog.eat();
        petDog.sleep();
        petDog.makeSound();
        petDog.move();
    }
}
