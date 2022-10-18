package ru.mirea.task3;

import java.util.Arrays;
import java.util.Random;

public class SortArrayOfDoubles {
    public static void main(String[] args){

        double arr[] = new double[10];

        System.out.print("Array from  Math.Random: ");
        for(int i = 0; i < 10; i++){
            arr[i] = Math.random() * 1000;
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr);
        System.out.print("\nArray from  Math.Random sorted: ");
        for(int i = 0; i < 10; i++){
            System.out.print(arr[i] + " ");
        }


        System.out.print("\nArray from  Random: ");
        int min = 300, max = 4564346;
        int diff = max - min;
        Random random = new Random();
        Double arr1[] = new Double[10];
        for(int i = 0; i < 10; i++){
            arr1[i] = random.nextDouble(diff + i);
            System.out.print(arr1[i] + " ");
        }
        Arrays.sort(arr1);
        System.out.print("\nArray from  Random sorted: ");
        for(int i = 0; i < 10; i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
