package ru.mirea.task3;

import static java.lang.String.valueOf;

public class Shells {
    public static void main(String[] args) {
        String s = "2.0";
        Double x = Double.valueOf(s);
        double y = Double.parseDouble(s);
        float a = Float.valueOf(String.valueOf(x));
        byte b = Byte.valueOf(String.valueOf(x));
        short sh = Short.valueOf(String.valueOf(x));
        long l = Long.valueOf(String.valueOf(x));
        boolean bo = Boolean.valueOf(String.valueOf(x));
    }
}
