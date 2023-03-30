package com.goleb.wojciech.sieveOfEratosthenes;

import java.util.Arrays;
import java.util.Scanner;

/**
 * A program listing prime numbers.
 * Few attempts to improve 'basic' iteration.
 * Then compared with Sieve of Eratosthenes.
 */
public class SieveOfEratosthenes {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int LINE_SEPARATOR_EVERY = 100;
    private static int loopCounter = 0;

    public static void main(String[] args) {

        System.out.println("Hi, I can list the prime numbers");


        //attempt 1 checks every number.
        int NumberFromUser = readIntFromUser();
        System.out.print("1 ");
        for (int i = 2; i <= NumberFromUser; i++) {
            boolean isItDevidable = false;
            lineSeparator(LINE_SEPARATOR_EVERY, i);
            for (int j = 2; j <= i; j++) {
                loopCounter++;
                if ((i % j) == 0 && i != j) {
                    isItDevidable = true;
                }
                if (!isItDevidable) {
                    if (i == j) {
                        System.out.print(j + " ");
                    }
                }
            }
        }
        System.out.println("\nattempt 1 loop counter");
        System.out.println( loopCounter + "\n");

        //attempt 2 - less code and faster than 1
        loopCounter = 0;

        System.out.print("1 ");
        for (int i = 2; i <= NumberFromUser; i++) {
            lineSeparator(LINE_SEPARATOR_EVERY, i);
            for (int j = 2; j <= i; j++) {
                loopCounter++;
                if ((i % j) == 0 && i != j) {
                    break;
                }
                if (i == j) {
                    System.out.print(j + " ");
                }
            }
        }
        System.out.println("\nattempt 2 loop counter");
        System.out.println(loopCounter + "\n");

        //attempt 3 - optimalization for big numbers (checks only half).

        loopCounter = 0;
        System.out.print("1 ");
        for (int i = 2; i <= NumberFromUser; i++) {
            lineSeparator(LINE_SEPARATOR_EVERY, i);
            for (int j = 2; j <= i; j++) {
                loopCounter++;
                if ((i % j) == 0 && i != j) {
                    break;
                }
                if (i < (2 * j)) {
                    System.out.print(i + " ");
                    break;
                }
            }
        }
        System.out.println("\nattempt 3 loop counter");
        System.out.println(loopCounter + "\n");

        //attempt 4
        loopCounter = 0;
        boolean[] list = new boolean[NumberFromUser];

        for (int i = 2; i <= NumberFromUser; i++) {
            for (int number = 2; number <= NumberFromUser; number++) {
                if (!list[number - 1]) {
                    loopCounter++;
                    if (number != i && (number % i) == 0) {
                        list[number - 1] = true;
                    }
                }

            }
        }
        System.out.print("1 ");
        for (int i = 2; i <= NumberFromUser; i++) {
            if (!list[i - 1]) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nattempt 4 loop counter");
        System.out.println(loopCounter + "\n");
        loopCounter = 0;

        //SieveOfEratosthenes
        boolean[] list2 = new boolean[NumberFromUser + 1];
        Arrays.fill(list2, true);
        for (int i = 2; i <= Math.sqrt(NumberFromUser); i++) {
            for (int t = i + i; t < NumberFromUser; t = t + i) {
                loopCounter++;
                list2[t] = false;
            }
        }
        for (int r = 1; r < NumberFromUser; r++) {
            if (list2[r]) {
                System.out.print((r) + " ");
            }
        }
        System.out.println("\nsieve loop counter");
        System.out.println(loopCounter + "\n");
    }

    private static void lineSeparator(int separator, int number) {
        if (number % separator == 0) {
            System.out.println();
        }
    }

    private static int readIntFromUser() {
        boolean isInputInt;
        String line;
        int inputInt = 0;
        do {
            System.out.println("Please enter a positive number");
            line = SCANNER.nextLine();
            try {
                inputInt = Integer.parseInt(line);
                isInputInt = true;
            } catch (NumberFormatException e) {
                System.out.println("Enter only Integer Value");
                isInputInt = false;
                SCANNER.reset();
            }
        } while (!isInputInt);
        return ((inputInt > 0) ? inputInt : readIntFromUser());
    }
}

