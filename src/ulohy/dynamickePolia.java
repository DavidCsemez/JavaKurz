package ulohy;

import java.util.ArrayList;

public class dynamickePolia {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.get(0));


        // Zmena polozky v poly
        cars.set(0, "Audi");

        //Odstranenie prvku z pola
        cars.remove(3);

        //Vypise vsetky auta
        System.out.println("\nvypis vsetky auta");
        for(String konkretneauto:cars){
            System.out.println(konkretneauto);
        }

        System.out.println(cars.size());

        //Odstraneie vsetkych prvkov
        cars.clear();
        System.out.println(cars);


        ArrayList<Integer>dynamickePoleCisla=new ArrayList<Integer>();
        dynamickePoleCisla.add(3);
        dynamickePoleCisla.add(1);
        dynamickePoleCisla.add(2);
        dynamickePoleCisla.add(23);


        //vypis vsetky cisel z pola
        System.out.println("\nobash celeho pola");
        for (Integer konkretneCisla:dynamickePoleCisla)
            System.out.print(konkretneCisla + "\t");
    }
}
