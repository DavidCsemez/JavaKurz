package ulohy;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class scitanieVstupov {
    public static void main(String[] args) {
        double sucet=0;
        ArrayList<Double> cisla=new ArrayList<Double>();
        Scanner skener=new Scanner(System.in);
        System.out.println("Zadajte cisla");
        System.out.println("Program ukoncite zadanym zaporneho cisla");

        //Vkladanie prvkov do dynamickeho pola
        try {
            double nacitaneCislo = skener.nextDouble();
            for (; ; ) {
                if (nacitaneCislo < 0)
                    break;
                else
                    cisla.add(nacitaneCislo);
                    sucet+=nacitaneCislo;
                    nacitaneCislo = skener.nextDouble();
                }
        }catch(InputMismatchException e){
            System.out.println("Zadali ste pismeno");
        }
        //Zaokruhlenie suctu
        double sucetZa=Math.round(sucet*100.0)/100.0;
        if(sucetZa!=0) {
            System.out.printf("Sucet vsetkych cisel je %.2f", sucetZa);
        }
    }
}
