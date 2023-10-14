package oop.rozhranie;

public class Dog implements Animal {
    @Override
    public void animalSound() {
        System.out.println("Dog says: Haw Haw");
    }
    @Override
    public void sleep() {
        System.out.println("Zzz");
    }
    public void bark(){
        System.out.println("Haf Haf");
    }
}
