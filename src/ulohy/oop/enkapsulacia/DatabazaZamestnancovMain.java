package ulohy.oop.enkapsulacia;

import opp.enkapsulacia.KnihaSpravne;

import java.util.ArrayList;

public class DatabazaZamestnancovMain {
    public static void main(String[] args) {
        Zamestnanec zamestnanec1=new Zamestnanec("Anna","Zelena","Zena",1995);
        Zamestnanec zamestnanec2=new Zamestnanec("Alexander","Black","Muz",2000);
        Zamestnanec zamestnanec3=new Zamestnanec("Alena","Novakova","Zena",1980);

        ArrayList<Zamestnanec> zamestnanci= new ArrayList<>();
        zamestnanci.add(zamestnanec1);
        zamestnanci.add(zamestnanec2);
        zamestnanci.add(zamestnanec3);

        for (Zamestnanec zamestnanecAkoObjekt:zamestnanci){
            System.out.println();
            System.out.println(zamestnanecAkoObjekt);

        }
    }
}
