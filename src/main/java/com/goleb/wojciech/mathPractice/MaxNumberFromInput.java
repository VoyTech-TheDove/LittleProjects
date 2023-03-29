package com.goleb.wojciech.mathPractice;

import java.util.Scanner;

/**
 * Program pobiera liczby aż urzytkownik wpisze 0, nastepnie wyswietli najwieksza z nich
 */
public class MaxNumberFromInput {
    public static void main(String[] args) {
        int userLastInput;
        int userMaxInput;
        int zeroToEndInput = 1;
        Scanner newNumber = new Scanner(System.in);
        System.out.println("Witaj. Podaj pierwszą liczbę");
        try {
            if (newNumber.hasNextInt()) {
                userMaxInput = newNumber.nextInt();
                System.out.println("Podaj kolejną liczbę");
                System.out.println("Wpisz 0 aby zakończyć");
                while (zeroToEndInput > 0) {
                    try {
                        if (newNumber.hasNextInt()) {
                            userLastInput = newNumber.nextInt();
                            if (userLastInput == 0) {
                                zeroToEndInput = 0;
                                System.out.println("zero...");
                            } else {
                                if (userLastInput > userMaxInput) {
                                    userMaxInput = userLastInput;
                                }
                                System.out.println("Podaj kolejną liczbę");
                                System.out.println("Wpisz 0 aby zakończyć");
                            }
                        } else {
                            System.out.println("Coś poszło nie tak...");
                            zeroToEndInput = 0;
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                System.out.println("Najwyższa liczba to: " + userMaxInput);
            } else {
                System.out.println("Coś poszło nie tak...");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

