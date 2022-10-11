package ru.mirea.task1;

import java.util.Scanner;



public class ArrayViaFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        float med = 0;
        System.out.print("Введите размер массива: ");
        int array_size = in.nextInt();

        int[] arr = new int[array_size];
        for(int  i = 0; i < array_size; i++){
            System.out.print("Введите элемент массива: ");
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        med = sum / (float) array_size;
        System.out.println("Сумма = " + sum);
        System.out.println("Среднее = " + med);
    }

}

