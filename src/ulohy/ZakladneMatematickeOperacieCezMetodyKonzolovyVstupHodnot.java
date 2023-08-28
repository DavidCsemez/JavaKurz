package ulohy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZakladneMatematickeOperacieCezMetodyKonzolovyVstupHodnot {
    public static double scitanie(double cislo1, double cislo2){
        double sucet= cislo1+cislo2;
        return sucet;  // v praxi sa casto pouziva return cislo1+cislo2;
    }
    public static double odcitanie(double cislo1, double cislo2){
        double rozdiel= cislo1 - cislo2;
        return rozdiel;
    }
    public static double nasobenie(double cislo1, double cislo2){
        double nasobok = cislo1 * cislo2;
        return nasobok;
    }
    public static double delenie(double cislo1, double cislo2){
        double rozdiel= cislo1 / cislo2;
        return rozdiel;
    }
    public static double modulo(double cislo1, double cislo2){
        double zvysok= cislo1 % cislo2;
        return zvysok;
    }

    public static void vypis (String operacia, double cislo1, double cislo2, double vysledok){
        // Na odsadenie textu zlava sme použili %-10s ale pridli sme k nemu ďalší argument ako prázdny znak "" ale funguje to aj bez - nakoľko je to na začiatku riadku
        System.out.printf("%-10s %s 2 čisel %.1f a %.1f je: %.1f%n","", operacia, cislo1, cislo2, vysledok);
    }

    public static void main(String[] args){
        double cislo1=0, cislo2=0;
        // Konzolový vstup od použivatela
        Scanner skener=new Scanner(System.in);// inicializacia konzoloveho skenera na vstup z klavesnice
        System.out.println("Po zadaný čísla vždy potvrde číslo enterom");
        System.out.println("Zadaj prvé číslo: ");
        try{
            cislo1= skener.nextDouble();
        } catch (InputMismatchException e){
            System.out.println("Zadal si neakceptovatelny formát čisla");
            skener.close();
            System.exit(1);//Násilné ukončenie programu
        }

        System.out.println("Zadaj druhé číslo: ");
        try {
            cislo2 = skener.nextDouble();
        } catch (InputMismatchException e){
            System.out.println("Zadal si neakceptovatelny formát čisla");
            skener.close();
            System.exit(1); // opcionálne sa dá použit aj finally ale čo nasleduje vo finally sa aj tak vykoná, čiže ak v ňom zatvoríme skener tak ak zadáme správne čislo aj tak sa skener zatvorí a nevieme pokračovať v programe

        }

        vypis("Súcet",cislo1, cislo2, scitanie(cislo1,cislo2));
        vypis("Rozdiel",cislo1, cislo2, odcitanie(cislo1,cislo2));
        vypis("Nasobok",cislo1, cislo2, nasobenie(cislo1,cislo2));
        vypis("Podiel",cislo1, cislo2, delenie(cislo1,cislo2));
        vypis("Zvysok(modulo)",cislo1, cislo2, modulo(cislo1,cislo2));
    }

}
