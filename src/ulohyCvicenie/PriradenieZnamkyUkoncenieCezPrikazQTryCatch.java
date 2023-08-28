package ulohyCvicenie;

import java.util.Scanner;

public class PriradenieZnamkyUkoncenieCezPrikazQTryCatch {
    public static void main(String[] args) {
        while(true){ //nekonecný cyklus
            Scanner skener=new Scanner(System.in);
            System.out.println("Zadajte počet bodov: ");
            String body=skener.nextLine();
            if(body.equals("q") || body.equals("Q")){
                System.out.println("Program bol ukončený");
                skener.close();
                break;
            }
            try {
                int body1 = Integer.parseInt(body);
                if (body1 >= 90 && body1 <= 100) {
                    System.out.println("Tvoja známka je: A");
                } else if (body1 >= 75 && body1 < 90) {
                    System.out.println("Tvoja známka je: B");
                } else if (body1 >= 65 && body1 < 75) {
                    System.out.println("Tvoja známka je: C");
                } else if (body1 > 100) {
                    System.out.println("Maximálny počet možných získaných hodnôt bolo 100 bodov");
                } else System.out.println("body nevyhohujú žiadnej známke");
            } catch (Exception e) {System.out.println("Zadali ste zle pismeno");}
        }
    }
}
