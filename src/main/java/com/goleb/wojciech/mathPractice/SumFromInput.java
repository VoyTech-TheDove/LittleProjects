package com.goleb.wojciech.mathPractice;

import java.util.Scanner;
/**
 * Sum of 2 numbers from input
 */
public class SumFromInput {

    public static void main(String[] args) {

        int firstNumber;
        int secondNumber;
        int sum;
        Scanner newNumber = new Scanner(System.in);

        System.out.println("Witaj. Podaj pierwszą liczbę");
        try {
            if (newNumber.hasNextInt()) {
                firstNumber = newNumber.nextInt();
                System.out.println("Podaj drugą liczbę");
                try {
                    if (newNumber.hasNextInt()) {
                        secondNumber = newNumber.nextInt();
                        sum = (firstNumber + secondNumber);
                        System.out.println("Suma tych liczb to: " + sum);
                    } else {
                        System.out.println("Coś poszło nie tak...");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Coś poszło nie tak...");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

