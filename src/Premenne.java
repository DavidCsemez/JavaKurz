public class Premenne {
    public static void main(String[] args) {
        String menoZamestnanca = "David";
        String priezviskoZamestnanca = "Csemez";
        String celemeno= menoZamestnanca+" "+priezviskoZamestnanca;

        System.out.println(menoZamestnanca+" "+priezviskoZamestnanca);
        System.out.println(celemeno);

        int cislo = 10;
        System.out.println(cislo);
        cislo= cislo+3;
        System.out.println(cislo);

        // provod double to int (manuálni prevod)
        double prevod=23.43;
        int prevodNaInt= (int) prevod;
        System.out.println(prevodNaInt);

        // prevod int to double (Automatický prevodd)
        int cisloInt=13;
        double prevodNaDouble= cisloInt;
        System.out.println(cisloInt);
        System.out.printf("%.1f%n",prevodNaDouble);
    }
}
