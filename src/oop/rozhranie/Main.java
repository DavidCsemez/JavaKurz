package oop.rozhranie;

public class Main {
    public static void main(String[] args) {
        Dog dog=new Dog();
        Pig pig=new Pig();
        pig.animalSound();
        pig.sleep();
        dog.animalSound();
        dog.sleep();
        dog.bark();

        //Animal myAnimal=new Animal(); Vytvorenie objektu z interface nie je mozne
    }
}
