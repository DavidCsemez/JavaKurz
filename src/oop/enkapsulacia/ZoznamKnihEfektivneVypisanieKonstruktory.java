package oop.enkapsulacia;

import java.util.ArrayList;

public class ZoznamKnihEfektivneVypisanieKonstruktory {
    public static void main(String[] args) {
            KnihaSpravne kniha1=new KnihaSpravne();
            kniha1.setNazov("Java");
            kniha1.setAutor("fnasjf sjfaj");
            kniha1.setCena(23.33);
            kniha1.setRokVydania(2000);

            System.out.println("Vypis detail knihy: ");
            System.out.println("Názov knihy: "+kniha1.getNazov());
            System.out.println("Autor knihy: "+kniha1.getAutor());
            System.out.println("Rok vydanie knihy: "+kniha1.getRokVydania());
            System.out.println("Cena knihy: "+kniha1.getCena());
            System.out.println("\n");
            KnihaSpravne kniha2=new KnihaSpravne();
            kniha2.setNazov("Jfsafa");
            kniha2.setAutor("hali papi");

            System.out.println("Vypis detail knihy: ");
            System.out.println("Názov knihy: "+kniha2.getNazov());
            System.out.println("Autor knihy: "+kniha2.getAutor());
            ArrayList<KnihaSpravne> knihy= new ArrayList<>();
            knihy.add(kniha1);
            knihy.add(kniha2);

            for (KnihaSpravne knihaObjekt:knihy){
                System.out.println();
                System.out.println(knihaObjekt);

            }
        }
    }

