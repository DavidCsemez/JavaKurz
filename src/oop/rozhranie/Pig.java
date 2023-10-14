package oop.rozhranie;

public class Pig implements Animal{

    @Override // znamenie ze metoda je prepisana (nemusi tam byt)
    public void animalSound() {
        System.out.println("Pig says: kwe kwe");
    }
    @Override
    public void sleep() {
        System.out.println("Zzz");
    }
    public void run(){
        //moze mat nieco do plusu, ktore nie je v nadradenej triede
        //v pripade ak by sme pridali Override tak by to uz nefungovalo nakolko metoda nie je v interface
    }
}
