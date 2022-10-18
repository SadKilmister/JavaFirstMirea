package ru.mirea.task3;

public class TestConverter {
    public static void main(String[] args) {
        Converter c = new Converter();
        c.cnyToUsd(1);
        c.usdToCny(1);
        c.usdToEur(1);
        c.eurToUsd(1);
    }
}
