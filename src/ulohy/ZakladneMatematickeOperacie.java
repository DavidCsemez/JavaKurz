package ulohy;

public class ZakladneMatematickeOperacie {
    public static void main(String[] args){
        double cislo1 = 11, cislo2=2;
        double sucet = cislo1+cislo2;
        double odcitanie = cislo1 - cislo2;
        double nasobenie = cislo1 * cislo2;
        double delenie = cislo1 / cislo2;
        double modulo = cislo1 % cislo2;

        // matematické operácie v jave
        System.out.println("Výsledok sčitania hodnôt "+ cislo1 +" a " +cislo2 + " je " + (cislo1+cislo2));
        System.out.println("Výsledok sčitania hodnôt "+ cislo1 +" a " +cislo2 + " je " + sucet);
        System.out.printf("Výsledok scitania hodnot %.1f a %.1f je %.1f%n", cislo1, cislo2, sucet); // znak scitovania je +
        System.out.printf("Výsledok odcitania hodnot %.1f a %.1f je %.1f%n", cislo1, cislo2, odcitanie); // znak odcitovania je -
        System.out.printf("Výsledok nasobenia hodnot %.1f a %.1f je %.1f%n", cislo1, cislo2, nasobenie); // znak nasobenia *
        System.out.printf("Výsledok delenia hodnot %.1f a %.1f je %.1f%n", cislo1, cislo2, delenie); // znak delenia je /
        System.out.printf("Výsledok modula (zvyšku po deleni) hodnot %.1f a %.1f je %.1f%n", cislo1, cislo2, modulo); // znak modula je % (jej úlohou je vypísanie zvyšku po delení


    }
}
