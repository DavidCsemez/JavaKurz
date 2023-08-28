import java.util.Date;

public class PremenaCezVar {
    public static void main(String[] args) {
        var meno = "Ján";
        var priezvisko = "Žitniak";
        var menoPriezvisko = meno + " " + priezvisko;
        System.out.println("Moje meno a priezvisko je: " + menoPriezvisko);

        var a = 10;
        var b = 20;
        var sucet= a+b;
        System.out.println("Sucet a a b je: " + (a + b));
        System.out.println("Sucet a a b je: " + sucet);

        var aktualnyDatum = new Date();
        System.out.println("Aktualny datum a cas je: " + aktualnyDatum);

    }
}
