package ru.mirea.task1;

import java.util.Scanner;

public class Factorial {

    public static int calculate(int n){
        int result = 1;
        for(int i = 1; i < n + 1; i++){
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        System.out.println(calculate(number));
    }
}
