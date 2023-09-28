package ulohy.oop.enkapsulacia.prepojenie2tabuliek.priklad2;

import java.time.LocalDate;
import java.util.ArrayList;

public class EvidenciaKnih {
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
    }
}
