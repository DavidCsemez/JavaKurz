package ulohy.oop.enkapsulacia.prepojenie2tabuliek.priklad1;

import java.time.LocalDate;

public class EvidenciaZamestnancov {
    public static void main(String[] args) {
        Zamestnanec janko=new Zamestnanec("Dávid","Csemez", LocalDate.of(2001,05,24),new Zamestnavatel("Google","Hlavna ulica 3", "Bratislava","831 01"));
        System.out.println(janko);
    }
}
