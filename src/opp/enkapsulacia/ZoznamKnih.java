package opp.enkapsulacia;

import java.util.ArrayList;

public class ZoznamKnih {
    public static void main(String[] args) {
        //vytvorenie prvej knihy
        Kniha kniha1=new Kniha();// vytvorili sme objek (alebo instanciu triedy) s nazvom kniha1
        kniha1.nazov="Java";
        kniha1.autor="Hali nice";
        kniha1.cena=2.30;
        kniha1.rokVydania=1990;

        System.out.println("Nazov knihy: "+ kniha1.nazov);
        System.out.println("Autor knihy: "+ kniha1.autor);
        System.out.println("Cena knihy: "+ kniha1.cena);
        System.out.println("Rok vydanie knihy: "+ kniha1.rokVydania);

        System.out.println();
        //vytvorenie druhej knihy
        Kniha kniha2=new Kniha();// vytvorili sme objek (alebo instanciu triedy) s nazvom kniha1
        kniha2.nazov="Ja, robot";
        kniha2.autor="Isaac Asimov";


        System.out.println("Nazov knihy: "+ kniha2.nazov);
        System.out.println("Autor knihy: "+ kniha2.autor);

        //Ulozenie knich do ArrayList-u
        ArrayList<Kniha>knihy= new ArrayList<>();
        knihy.add(kniha1);
        knihy.add(kniha2);


        //Vypisanie obsahu knih

        for (Kniha konkretnaKniha:knihy){
            System.out.println("Nazov knihy: "+ konkretnaKniha.nazov);
            System.out.println("Autor knihy: "+ konkretnaKniha.autor);
            System.out.println("Cena knihy: "+ konkretnaKniha.cena);
            System.out.println("Rok vydanie knihy: "+ konkretnaKniha.rokVydania);
        }
    }
}
