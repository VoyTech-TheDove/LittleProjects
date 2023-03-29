package com.goleb.wojciech.mathPractice;

import java.util.Arrays;

/**
 * Simple math exercises
 */
public class MathPractice {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();

        System.out.println("Practice 1 - is it even?");
        int[] numbers = {103, 56, 123, 33};
        for (int i : numbers) {
            String isItEven = i % 2 == 0 ? "even" : "uneven";
            System.out.println("Number: " + i + " is " + isItEven);
        }
        System.out.println();

        System.out.println("Practice 2 - table 10 -100");
        int[] tableOfTens = new int[10];
        System.out.println("tableOfTens: " + Arrays.toString(tableOfTens));
        int k = 1;
        for (int j : tableOfTens) {
            tableOfTens[j] = (k++) * 10;
            System.out.print(tableOfTens[j] + " ");
        }

        System.out.println();

        System.out.println("Practice 3 - sum");
        int[] numbersToSum = {1, 12, 41, 51, 12};
        int sum = 0;
        for (int i = 0; i < numbersToSum.length; i++) {
            sum += numbersToSum[i];
            System.out.print(sum + "\t");
        }
        System.out.println();

        int sum2 = 0;
        for (int l : numbersToSum) {
            sum2 += l;
            System.out.print(sum2 + "\t");
        }
    }
}
