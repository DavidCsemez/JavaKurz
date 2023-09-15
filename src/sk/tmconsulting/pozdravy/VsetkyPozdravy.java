package sk.tmconsulting.pozdravy;

import sk.tmconsulting.pozdravy.anglicky.Hello;
import sk.tmconsulting.pozdravy.madarsky.Szia;
import sk.tmconsulting.pozdravy.nemecky.Hallo;
import sk.tmconsulting.pozdravy.slovensky.Ahoj;

import java.util.Scanner;

public class VsetkyPozdravy {
    public static void main(String[] args) {
        Scanner skener=new Scanner(System.in);
        //Zadanie jazyku v ktorom program vypise pozdrav

        //Vypis jazykov
        System.out.println("Výber jazyka:");
        System.out.println("\t1-Slovensky");
        System.out.println("\t2-Madarsky");
        System.out.println("\t3-Anglicky");
        System.out.println("\t4-Nemecky");
        //Naskenovanie cisla pre zvolenie jazyka
        int cislo=skener.nextInt();
        skener.nextLine();//Nacita \n po nextInt nakolko nextInt \n vynecha a ak dame nextLine ako prve nacita \n a necaka na zadanie textu od uzivatela
        //Deklarovanie objektu z inej triedy
        Ahoj ahoj = new Ahoj();
        Hallo hallo=new Hallo();
        Szia szia=new Szia();
        Hello hello=new Hello();
        //Pridanie hodnoty k premennej v inej triede
       /* ahoj.meno=menoUzivatela;
        szia.meno=menoUzivatela;
        hallo.meno=menoUzivatela;
        hello.meno=menoUzivatela;*/
        //Volanie metody z inej triedy
        switch (cislo){
            case 1: {
                System.out.println("Zadajte Vase uzivatelske meno:");
                ahoj.meno= skener.nextLine();
                ahoj.pozdrav();
                break;
            }
            case 2:{
                System.out.println("Írd be a felhasználóneved:");
                szia.meno=skener.nextLine();
                szia.pozdrav();
                break;
            }
            case 3:{
                System.out.println("Enter your username:");
                hello.meno=skener.nextLine();
                hello.pozdrav();
                break;
            }
            case 4:{
                System.out.println("Geben Sie Ihren Benutzernamen ein:");
                hallo.meno= skener.nextLine();
                hallo.pozdrav();
                break;
            }
            default:
                System.out.println("Zadali ste nespravne cislo jazyka ");
        }
    }
}
