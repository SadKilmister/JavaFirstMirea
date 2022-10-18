package ru.mirea.task3;

import java.util.Random;
public class ArrayFrom10To99 {
    public static void main(String[] args) {
        Random random = new Random();
        int arr[] = new int[4];
        for(int i = 0; i < 4; i++) {
            arr[i] = random.nextInt(10, 100);
            System.out.print(arr[i] + " ");
        }

        if((arr[0] < arr[1]) &(arr[1] < arr[2]) &(arr[2] < arr[3]))
            System.out.print("\nСтрого возрастающая последовательность");
        else
            System.out.print("\nНе строго возрастающая последовательность");
    }
}
