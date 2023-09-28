package ulohy.oop.enkapsulacia.prepojenie2tabuliek.priklad2;

import java.time.LocalDate;

public class Autor {
    private String meno;
    private String priezvisko;
    private LocalDate datumNarodenia;

    public Autor() {
    }

    public Autor(String meno, String priezvisko, LocalDate datumNarodenia) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.datumNarodenia = datumNarodenia;
    }
    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public LocalDate getDatumNarodenia() {
        return datumNarodenia;
    }

    public void setDatumNarodenia(LocalDate datumNarodenia) {
        this.datumNarodenia = datumNarodenia;
    }

    @Override
    public String toString() {
        return "Meno autora: "+meno+"\n"+"Priezvisko autora: "+priezvisko+"\n"+"Datum narodenia autora: "+datumNarodenia;
    }
}
