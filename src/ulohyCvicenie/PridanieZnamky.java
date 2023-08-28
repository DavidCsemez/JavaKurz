package ulohyCvicenie;
/*
 Popis z pohladu použivaatela:
    zadá percentuálnu hodnotu známok
    zadanie ukončí enterom
    Program vyhodnotí a vypíše známku podľa kritéria
    Program bude funguvať až po zadanie hodnoty -1
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class PridanieZnamky {
    public static void vyhodnotenie( int body){
        if (body >= 90 && body<=100) {
            System.out.println("Tvoja známka je: A");
        }
        else if (body >= 75 && body < 90) { // && musia platiť oba výrazy súčastne ( logický výraz AND (a))
            System.out.println("Tvoja známka je: B"); // || platí buď prvá podmienka alebo druhá to znamená že z dvoch podmienok je pravdiva iba jedna ( logický výraz OR (alebo))
        }
        else if (body >= 65 && body < 75) {
            System.out.println("Tvoja známka je: C");
        }
        else if (body >100) {
            System.out.println("Maximalny počet bodov ktorých ste mohli získať bolo 100");
        }
        else if (body < 0) {
            System.out.println("Program bol ukončení");
        }
        else{
            System.out.println("Zadané body nevyhovujú žiadnej známke");
        }
    }
    public static void main(String[] args) {
        Scanner skener=new Scanner(System.in);
        int body=0;
        while(body!=-1) { // dá sa nahradiť while(true) {}
        System.out.println("Zadaj počet bodov: ");
            try {
                body = skener.nextInt();
                vyhodnotenie(body);
            } catch (InputMismatchException e) {
                System.out.println("Zadali ste nesprávni formát čísla, skús bez desatiných čísel");
            }
        }
        skener.close();
    }
}
