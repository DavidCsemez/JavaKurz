package ulohyCvicenie;

import java.text.Normalizer;
import java.util.Scanner;

public class PridanieZnamkyTextovemuhodnotenie {
    public static String diakritika(String text) { //metóda odstráni diakritiku zo zadaného textu
        return Normalizer.normalize(text, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "")
                .replaceAll("[^\\p{ASCII}]","");
    }

    public static void main(String[] args) {
        while (true) {
            Scanner skener = new Scanner(System.in);
            System.out.println("Zadajte známku slovne: ");
            String znamka = skener.nextLine();
            znamka=diakritika(znamka);
            if (znamka.equals("koniec")) {
                skener.close();
                break;
            } else if (znamka.equals("vyborny")) {
                System.out.println("Známka je: 1");
            } else if (znamka.equals("chvalitebny")) {
                System.out.println("Známka je: 2");
            } else if (znamka.equals("dobry")) {
                System.out.println("Známka je: 3");
            } else if (znamka.equals("dostatocny")) {
                System.out.println("Známka je: 4");
            } else if (znamka.equals("nedostatocny")) {
                System.out.println("Známka je: 5");
            } else System.out.println("Zadali ste známku,ktorá neexistuje alebo ste spravili preklep");
        }
    }
}
