package ulohy.oop.enkapsulacia.prepojenie2tabuliek.priklad3;

import opp.enkapsulacia.ZoznamKnih;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Kniha kniha1=new Kniha("Ja, robot",1980,new Autor("Isaac","Asimov", LocalDate.of(1900,8,26)));
        System.out.println(kniha1);

        Kniha kniha2=new Kniha(null,0,null);
        kniha2.setNazov("Duna");
        kniha2.setRokVydania(1978);
        Autor autor2=new Autor("Frank","Herbert",LocalDate.of(1910,9,28));
        kniha2.setAutor(autor2);
        System.out.println(kniha2);

        Kniha kniha3=new Kniha();
        kniha3.setNazov("Java pre zaciatocnikov");
        kniha3.setRokVydania(2000);
        kniha3.setAutor(new Autor("Jan","Zitniak",LocalDate.of(2000,1,20)));
        System.out.println(kniha3);

        //ArrayList<Kniha>  zoznamKnih=new ArrayList<>();
        var zoznamKnih=new ArrayList<Kniha>();
        zoznamKnih.add(kniha1);
        zoznamKnih.add(kniha2);
        zoznamKnih.add(kniha3);


        //vypis kniy, ktore su v zozname knih
        System.out.println("\nZoznam vsetkych knih");
        System.out.println("---------------------------------");
        for(Kniha konkretnaKniha:zoznamKnih){
            System.out.println(konkretnaKniha);
            System.out.println("-------------------------------------------");
        }

        ArrayList<Kniha>knihy1=new ArrayList<>();
        zoznamKnih zoznamKnih1=new zoznamKnih();
        zoznamKnih1.pridajKnihu(knihy1,kniha1);//Pridanie konkretnej knihy
        zoznamKnih1.pridajKnihu(knihy1,kniha2);//Pridanie dalsej knihy č.2
        zoznamKnih1.pridajKnihu(knihy1,kniha3);//Pridanie dalsej knihy č.3


        zoznamKnih1.vypisVsetkyKnihy(knihy1);//Zobrazenie vsetkych knih
    }
}
