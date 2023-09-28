package ulohy.oop.enkapsulacia.prepojenie2tabuliek.priklad2;

public class Kniha {
    private String nazov;
    private int rokVydania;
    private Autor autor;
//  konstruktor, ktory je bez parametrov
    public Kniha() {
    }

    //  konstruktor, ktory je parametricky
    public Kniha(String nazov, int rokVydania, Autor autor) {
        this.nazov = nazov;
        this.rokVydania = rokVydania;
        this.autor = autor;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public int getRokVydania() {
        return rokVydania;
    }

    public void setRokVydania(int rokVydania) {
        this.rokVydania = rokVydania;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Nazov knihy: "+nazov+"\n"+"Rok vydanie: "+rokVydania+"\n"+autor;
    }
}
