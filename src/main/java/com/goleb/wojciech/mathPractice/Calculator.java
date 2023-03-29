package com.goleb.wojciech.mathPractice;
import java.util.Scanner;

/**
 * This is a simple calculator which can do a single mathematical operation
 * it will close upon entering wrong input
 */
public class Calculator {

    public static void main(String[] args) {
        double num1 = 0;
        double num2 = 0;
        double output;
        char operator = 'a';
        System.out.println("Hello I am able to do some calculations");
        System.out.println("Enter the first number");

        Scanner scanner = new Scanner(System.in);
        try {
            if (scanner.hasNextDouble()) {
                num1 = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Enter the operator:+,-,*,:,%(modulo),^(power)");
                if (scanner.hasNextLine()) {
                    operator = scanner.next().charAt(0);
                    System.out.println("Enter the second number");
                    if (scanner.hasNextDouble()) {
                        num2 = scanner.nextDouble();
                    } else {
                        System.out.println("wrong input");
                        scanner.nextLine();
                    }
                } else {
                    System.out.println("wrong input");
                    scanner.nextLine();
                }
            } else {
                System.out.println("wrong input");
                scanner.nextLine();
            }
            switch (operator) {
                case '+':
                    num1 = num1 + num2;
                    break;
                case '-':
                    num1 = num1 - num2;
                    break;
                case '*':
                    num1 = num1 * num2;
                    break;
                case ':':
                case '/':
                    num1 = num1 / num2;
                    break;
                case '%':
                    num1 = num1 % num2;
                    break;
                case '^':
                    num1 = getNum1(num1, num2);
                    break;
                default:
                    System.out.println("You have entered incorrect operator");
            }
        } finally {
            System.out.println(num1);
        }
    }
    private static double getNum1(double num1, double num2) {
        double output;
        output = num1;
        int i = 1;
        while (i < num2) {
            output = output * num1;
            i++;
        }
        if (num2 == 0) {
            num1 = 1;
        }
        num1 = output;
        return num1;
    }
}

