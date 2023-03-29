package com.goleb.wojciech.randomNumberGen;

/**
 * Program utilizing various random number generations
 */
public class RandomizerRun {
    public static void main(String[] args) {

        System.out.println(Randomizer.generateRandomNumberBracketsInClass());
        System.out.println(Randomizer.generateRandomNumberFromLowToHigh(-12, -10));
        System.out.println(Randomizer.generateRandomNumberFromLowToHigh(-10, -12));
        System.out.println();

        System.out.println(Randomizer.generateRandomNumberFractionDecimalInClass());
        System.out.println(Randomizer.generateRandomNumberFractionDecimalInClass());
        System.out.println(Randomizer.generateRandomNumberFractionDecimalGiven(2));
        System.out.println();

        System.out.println(Randomizer.generateRandomStringOfCharLenghtFromClass());
        System.out.println(Randomizer.generateRandomStringOfCharLenghtGiven(5));
    }
}
