package ulohy;
public class ZakladneMatematickeOperacieCezMetody {
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
        double cislo1=8, cislo2=2.5;
        /*scitanie(cislo1, cislo2); (metoda sa zavola a vykoná ale nevypíše sa na konzolu)
        System.out.println("Sucet dvoch cisel je : "+ scitanie(cislo1, cislo2));*/
        /*System.out.printf("Sucet dvoch cisel %.1f a %.1f je: %.1f%n", cislo1,cislo2,scitanie(cislo1,cislo2));
        System.out.printf("Rozdiel dvoch cisel %.1f a %.1f je: %.1f%n", cislo1,cislo2,odcitanie(cislo1,cislo2));
        System.out.printf("Nasobok dvoch cisel %.1f a %.1f je: %.1f%n", cislo1,cislo2,nasobenie(cislo1,cislo2));
        System.out.printf("Rozdiel dvoch cisel %.1f a %.1f je: %.1f%n", cislo1,cislo2,delenie(cislo1,cislo2));
        System.out.printf("Zvysok rozdielu dvoch cisel %.1f a %.1f je: %.1f%n", cislo1,cislo2,modulo(cislo1,cislo2));*/

        // výpis mat operacií pomocou metódy
        vypis("Súcet",cislo1, cislo2, scitanie(cislo1,cislo2));
        vypis("Rozdiel",cislo1, cislo2, odcitanie(cislo1,cislo2));
        vypis("Nasobok",cislo1, cislo2, nasobenie(cislo1,cislo2));
        vypis("Podiel",cislo1, cislo2, delenie(cislo1,cislo2));
        vypis("Zvysok(modulo)",cislo1, cislo2, modulo(cislo1,cislo2));
    }

}
