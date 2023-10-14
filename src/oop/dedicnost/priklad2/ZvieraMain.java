package oop.dedicnost.priklad2;

class Zviera{
    String meno;
    public Zviera(String meno){
        this.meno = meno; //konstruktor, ktory zada meno pre dne zviera
    }
    public void zvuk(){ System.out.println(meno+" Zviera vyda zvuk");
    }
}

class Pes extends Zviera {
    public Pes(String meno){
        super(meno);//super zavola konstruktor vysej triedy (cize this.meno), ktory zada meno pre dane zviera
    }
    //prepisuje (OVERRIDE) metodu z nadradenej triedy
    @Override//bez neho program konci s chybou
    public void zvuk(){
        System.out.println(meno+" šteka: Haf! Haf!");
    }
}

public class ZvieraMain {
    public static void main(String[] args) {
        Zviera zviera = new Zviera("");
        zviera.zvuk();
        Pes pes = new Pes("Buddy");
        pes.zvuk();
    }

}