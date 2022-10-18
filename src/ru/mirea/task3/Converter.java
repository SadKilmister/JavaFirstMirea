package ru.mirea.task3;

import java.text.NumberFormat;
import java.util.Locale;
public class Converter {
    public Converter() {
    }

    void cnyToUsd(double n){
        NumberFormat NF1 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat NF2 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(NF1.format(n) + "=" + NF2.format(n * 0.138));
    }
    void usdToCny(double n){
        NumberFormat NF1 = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat NF2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println(NF1.format(n) + "=" + NF2.format(n * 7.25));
    }

    void usdToEur(double n){
        NumberFormat NF1 = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat NF2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println(NF1.format(n) + "=" + NF2.format(n * 1.01));
    }

    void eurToUsd(double n){
        NumberFormat NF1 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat NF2 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(NF1.format(n) + "=" + NF2.format(n * 0.986));
    }
}
