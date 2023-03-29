package com.goleb.wojciech.highToLowSorter;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Program that takes in whole numbers and sorts them descending then displays.
 */
public class HighToLowSorter {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hi, I sort the numbers ");
        ArrayList<Integer> list;

        list = readIntFromUser();
        list = sortTheList(list);
        System.out.println(list);
    }

    private static ArrayList<Integer> sortTheList(ArrayList<Integer> list) {
        if (list.isEmpty() || ((list.size() < 2))) {
            return list;
        }
        boolean changed = false;

        for (int i = 0; i < list.size() - 1; i++) {
            int thisNumber = list.get(i);
            int nextNumber = list.get(i + 1);
            if (thisNumber < nextNumber) {
                list.set(i, nextNumber);
                list.set(i + 1, thisNumber);
                changed = true;
            }
        }
        return ((changed) ? sortTheList(list) : list);
    }

    private static ArrayList<Integer> readIntFromUser() {
        ArrayList<Integer> list = new ArrayList<>();
        String line;
        System.out.println("Please enter only whole numbers");
        line = SCANNER.nextLine();
        String[] numbers = line.split("[^\\d-]+");
        for (String number : numbers) {
            try {
                list.add(Integer.parseInt(number));
            } catch (NumberFormatException e) {
                SCANNER.reset();
            }
        }
        return list;
    }
}