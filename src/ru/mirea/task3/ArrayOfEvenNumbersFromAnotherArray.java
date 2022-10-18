package ru.mirea.task3;

import java.util.Scanner;
import java.util.Random;
public class ArrayOfEvenNumbersFromAnotherArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n;
        int c = 0;
        while(true){
            try{
                n = Integer.parseInt(scanner.next());
                break;
            }catch(NumberFormatException e){
                System.out.print("Повторите ввод\n");
            }
        }

        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = random.nextInt(0,n + 1);
            System.out.print(a[i] + " ");
            if (a[i] % 2 == 0)
                c++;
        }
        if (c != 0){
            System.out.print("\n");
            int iter = 0;
            int a_new[] = new int[c];
            for(int i = 0; i < n; i++){
                if(a[i] % 2 == 0){
                    a_new[iter] = a[i];
                    System.out.print(a_new[iter] + " ");
                    iter++;
                }
            }
        }
        else
            System.out.print("\nНет чертных чисел");
    }
}
