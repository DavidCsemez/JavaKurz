package ulohy.oop.enkapsulacia;

public class Zamestnanec {
    private String meno;
    private String priezvysko;
    private String pohlavie;
    private int rokNarodenia;


    public Zamestnanec() {
    }

    public Zamestnanec(String meno, String priezvysko, String pohlavie, int rokNarodenia) {
        this.meno = meno;
        this.priezvysko = priezvysko;
        this.pohlavie = pohlavie;
        this.rokNarodenia = rokNarodenia;
    }

    public String getMeno() {
        return meno;
    }
    public void setMeno(String meno) {
        this.meno = meno;
    }
    public String getPriezvysko() {
        return priezvysko;
    }
    public void setPriezvysko(String priezvysko) {
        this.priezvysko = priezvysko;
    }
    public String getPohlavie() {
        return pohlavie;
    }
    public void setPohlavie(String pohlavie) {
        this.pohlavie = pohlavie;
    }
    public int getRokNarodenia() {
        return rokNarodenia;
    }
    public void setRokNarodenia(int rokNarodenia) {
        this.rokNarodenia = rokNarodenia;
    }

    @Override
    public String toString() {
        return "Meno zamestnanca: "+meno+"\nPriezvisko zamestnanca: "+priezvysko+"\nPohlavie zamestnanca: "+pohlavie+"\nRok narodenia zamestnanca: "+rokNarodenia;
    }
}
