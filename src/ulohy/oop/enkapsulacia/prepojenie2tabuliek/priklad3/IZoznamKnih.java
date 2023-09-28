package ulohy.oop.enkapsulacia.prepojenie2tabuliek.priklad3;
//TODO Vytvorit metody, ktorymi budeme naplnat knihy do zoznamu knih a vypisanie vsetkych knih

import java.util.ArrayList;

public interface IZoznamKnih {
    void pridajKnihu(ArrayList <Kniha>knihy,Kniha kniha);
    void vypisVsetkyKnihy(ArrayList<Kniha>knihy);
}
