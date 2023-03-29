package com.goleb.wojciech.randomNumberGen;

import java.util.Random;
import java.util.UUID;

public class Randomizer {

    private static final Random RANDOM = new Random();
    private static int lowNumb = 53;
    private static int highNumb = 101;
    private static int decimal = 3;
    private static int lenghtOfString = 10;


    public static int generateRandomNumberBracketsInClass() {
        return generateRandomNumberFromLowToHigh(lowNumb, highNumb);
    }

    public static int generateRandomNumberFromLowToHigh(int lowNumb, int highNumb) {
        if (lowNumb < highNumb) {
            return RANDOM.nextInt(highNumb - lowNumb + 1) + lowNumb;
        } else {
            return RANDOM.nextInt(lowNumb - highNumb + 1) + highNumb;
        }
    }

    public static String generateRandomNumberFractionDecimalInClass() {
        return generateRandomNumberFractionDecimal(decimal);
    }

    public static String generateRandomNumberFractionDecimalGiven(int decimal) {
        return generateRandomNumberFractionDecimal(decimal);
    }

    private static String generateRandomNumberFractionDecimal(int decimal) {
        return String.format("%." + decimal + "f", (generateRandomNumberFraction()));
    }

    private static double generateRandomNumberFraction() {
        return RANDOM.nextDouble() * 10;
    }

    public static String generateRandomStringOfCharLenghtFromClass() {
        return generateRandomStringOfCharLenghtUpTo32(lenghtOfString);
    }

    public static String generateRandomStringOfCharLenghtGiven(int lenght) {
        return generateRandomStringOfCharLenghtUpTo32(lenght);
    }

    private static String generateRandomStringOfCharLenghtUpTo32(int lenght) {
        return generateRandomStringOf32Char().substring(0, lenght);
    }

    private static String generateRandomStringOf32Char() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
