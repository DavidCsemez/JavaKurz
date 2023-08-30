package ulohy;

import java.util.Arrays;
import java.util.OptionalDouble;

public class ZakladneExcelFunkcie {

    public static double sucet(double [] cisla){
        double sum=0;
        for (int i=0;i< cisla.length;i++){
            sum=sum+cisla[i]; // sum += cisla[i];  identické ako zaciatok riadku
        }
        return sum;
    }

    public static double getAvarage(double [] cisla){
        double sum=0;
        for (int i=0;i< cisla.length;i++){
            sum=sum+cisla[i]; // sum += cisla[i];  identické ako zaciatok riadku
        }
        return sum/cisla.length;
    }

    public static double getAvarageEfective (double [] cisla){
        return sucet(cisla)/ cisla.length;
    }

    public static double getMin(double [] cisla){
        double min=cisla[1];
        for (int i=0;i< cisla.length;i++){
            if (min>cisla[i]){
                min=cisla[i];
            }
        }
        return min;
    }

    public static double getMax(double [] cisla){
        double max=cisla[1];
        for (int i=0;i< cisla.length;i++){
            if (max<cisla[i]){
                max=cisla[i];
            }
        }
        return max;
    }

    public static  Double getMaxEfective(double [] cisla){  // opcionalne sa dá vytvorit aj pre min, sum, avarage
        return Arrays.stream(cisla).max().getAsDouble();
    }

    public static double getPocet(double [] cisla){
        return cisla.length;
    }

    public static void main(String[] args) {
        double[] cisla ={56,70,65,98,50};
        System.out.println(sucet(cisla));
        System.out.println(sucet(cisla)/ cisla.length);
        System.out.println(getAvarage(cisla));
        System.out.println(getAvarageEfective(cisla));
        System.out.println(getMin(cisla));
        System.out.println(getMax(cisla));
        System.out.println(getPocet(cisla));
        System.out.println(getMaxEfective(cisla));
        Arrays.sort(cisla); // zoradi csla v poli od najmensieho po najvacsie
    }
}
