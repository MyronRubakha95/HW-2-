package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("1. Заповнити масив тільки парними числами");
        int[] array = new int[15];

        for (int i = 1; i < array.length; i++) {
            if ((i % 2) == 0)
                System.out.println(i);
        }


        System.out.println("2. Заповнити масив рандомними числами");

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.println(array[i]);
        }


        System.out.println("3.Вивести середнє значення масиву");

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println((double) sum / array.length);

        System.out.println("4. Вивести суму всіх значень кратних 3");

        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 3) == 0) {
                a = a + array[i];

            }
        }
        System.out.println(a);


        System.out.println("5. Вивести значення всіх парних індексів масиву");


        for (int i = 1; i < array.length; i++) {
            if ((i % 2) == 0) {
                System.out.println(array[i]);
            }

        }
        System.out.println("6. Просортувати масив в порядку зростання");


        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array);
            System.out.println(array[i]);
        }

        System.out.println("7. Вивести найменше значення в масиві");
        int min = 10;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
        }
        System.out.println(min);

        System.out.println("Вивести найбільше значення масиву");

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
            }
        }

        System.out.println(max);

        System.out.println("9. Вивести суму значень всіх парних індексів");
        int c = 0;
        for (int i = 1; i < array.length; i++) {
            if ((i % 2) == 0) {
                c += array[i];

            }
        }
        System.out.println(c);

        System.out.println("10. Вивести перших 20 символів з таблиці ASCI");

        char[] asci = new char[20];
        for (char i = 32; i < 52; i++) {
            System.out.print(i);
        }


    }

}














