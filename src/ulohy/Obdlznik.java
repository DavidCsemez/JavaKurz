package ulohy;

import java.util.Scanner;

public class Obdlznik {
    public static double getObvod(double stranaA,double stranaB){
        double obvod=2*(stranaA+stranaB);
        return obvod;
    }

    public static double getObsah(double stranaA, double stranaB){
        double obsah=stranaA*stranaB;
        return  obsah;
    }

    public static String skenovanieNovehoCisla(){
        Scanner skener=new Scanner(System.in);
        System.out.println("(g)irth-na vypis obvodu");
        System.out.println("(c)ontent-na vypis objem");
        System.out.println("(n)ew= pre zadanie hodnot  a, b a nasledne vypocet obsahu/obvodu");
        System.out.println("(q)uit=ukoncenie programu");
        String status = skener.nextLine();
        status = status.toLowerCase();
        return status;
    }

    public static String skenovanie(){
        Scanner skener=new Scanner(System.in);
        String status=skener.nextLine();
        return status;
    }

    public static void main(String[] args) {
        Scanner skener=new Scanner(System.in);
        System.out.println("Vitam Ta v programe na vypocet obvodu a obsahu obdlznika. Zadaj jednu z nasledujucich moznosti: ");
        System.out.println("(s)tart= pre zadanie a, b a nasledne vypocet obsahu/obvodu");
        System.out.println("(q)uit=ukoncenie programu");
        String status=skenovanie();
        for(;;) {
            noveCislo:{
                if (status.equals("q")) {
                    System.out.println("Koniec programu");
                    break;
                } else if (status.equals("s") || status.equals("n")) {
                    System.out.println("Zadajte velkost strany A:");
                    double stranaA = skener.nextDouble();
                    System.out.println("Zadajte velkost strany B:");
                    double stranaB = skener.nextDouble();
                    skener.nextLine();
                    status= skenovanieNovehoCisla( );
                    for (; ; ) {
                        if (status.equals("g")) {
                            System.out.printf("Obvod obdlznika: %.2f %n", getObvod(stranaA, stranaB));
                        } else if (status.equals("c")) {
                            System.out.printf("Obsah obdlznika: %.2f %n", getObsah(stranaA, stranaB));
                        } else if (status.equals("n")) {
                            break noveCislo;
                        } else if (status.equals("q")) {
                            break noveCislo;
                        } else System.out.println("Zadali ste nespravny symbol");
                        status= skenovanieNovehoCisla( );
                    }
                } else {
                    System.out.println("Zadali ste nespravne symbol1");
                }
                System.out.println("(n)ew= pre zadanie hodnot  a, b a nasledne vypocet obsahu/obvodu");
                System.out.println("(q)uit=ukoncenie programu");
                status = skenovanie();
            }
        }
    }
}
