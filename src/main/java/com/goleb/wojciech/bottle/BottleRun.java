package com.goleb.wojciech.bottle;

/**
 * Program that creates bottles which can be filled and emptied.
 */
public class BottleRun {
    public static void main(String[] args) {
        System.out.println("Practice - bottleClass");
        Bottle[] bottle2L = new Bottle[50];


        for (int i = 0; i < bottle2L.length; i++) {
            bottle2L[i] = new Bottle(1, 2);
        }

        Bottle bottleOneL = new Bottle(0.5, 1);

        bottleOneL.emptyTheBottle();
        bottleOneL.fill(0.9);
        bottleOneL.fill(0.2);
        bottleOneL.pour(0.3);
        bottle2L[2].emptyTheBottle();
        bottle2L[2].evenOut(bottleOneL);

        Bottle bottleXX = new Bottle(10, 7.5);
    }
}