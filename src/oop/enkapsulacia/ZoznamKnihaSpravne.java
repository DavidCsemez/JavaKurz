package oop.enkapsulacia;

import java.util.ArrayList;

public class ZoznamKnihaSpravne {
    public static void main(String[] args) {
        KnihaSpravne kniha1=new KnihaSpravne("Java","Kazdy kto prispel",2000,3.99);
        KnihaSpravne kniha2=new KnihaSpravne("Ja, robot","Isaac Asimov",1960,10.50);

        ArrayList<KnihaSpravne> knihy= new ArrayList<>();
        knihy.add(kniha1);
        knihy.add(kniha2);

        for (KnihaSpravne knihaObjekt:knihy){
            System.out.println();
            System.out.println(knihaObjekt);

        }
    }
}
