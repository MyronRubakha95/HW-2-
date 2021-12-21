package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("1. Заповнити масив тільки парними числами");
        int[] array = new int[10];
        for (int i = 1; i < array.length; i++) {
            if ((i % 2) == 0) System.out.println(i);
        }
        System.out.println("2. Заповнити масив рандомними числами");

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {

            System.out.println(random.nextInt(100));
        }

        System.out.println("3.Вивести середнє значення масиву");

        int sum = 0;
        int[] arr = {12, 64, 2, 44, 45, 99};
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println((double) sum / arr.length);

        System.out.println("4. Вивести суму всіх значень кратних 3");

        int a = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            if ((i % 3) == 0) {
                a = a + i;

            }
        }
        System.out.println(a);

        System.out.println("5. Вивести значення всіх парних індексів масиву");

        int[] arr1 = {15, 46, 69, 87, 44, 14, 12, 10, 9, 8};
        for (int i = 1; i < arr1.length; i++) {
            if ((i % 2) == 0) {
                System.out.println(i);
            }
        }
        System.out.println("6. Просортувати масив в порядку зростання");

        int[] arry = {12, 6, 3, 69, 55, 64, 99, 102, 105, 63, 44, 76};
        for (int i = 0; i < arry.length; i++) {
            Arrays.sort(arry);
            System.out.println(arry[i]);
        }

        System.out.println("7. Вивести найменше значення в масиві");
        int min = 120;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] <= min) {
                min = arry[i];
            }
        }
        System.out.println(min);

        System.out.println("Вивести найбільше значення масиву");

        int max = 0;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] >= max) {
                max = arry[i];
            }
        }

        System.out.println(max);

        System.out.println("9. Вивести суму значень всіх парних індексів");
        int c = 0;
        for (int i = 1; i < arry.length; i++) {
            if ((i % 2) == 0) {
                c = c + i;

            }
        }
        System.out.println(c);

        System.out.println("10. Вивести перших 20 символів з таблиці ASCI");

        char[] asci = new char[20];
        for (char i = 0; i < asci.length; i++) {
            System.out.print(asci[i]);
        }

    }

}














