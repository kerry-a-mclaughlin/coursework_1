package com.courseworks.coursework1;

import java.util.InputMismatchException;
import java.util.Scanner;

class Dec2Hex {

    private static int arg1;

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the integer you would like to switch to hex.");
        String userInt = scanner.nextLine();

        convertInputToIntegerAndConvertToHex(userInt);
    }

    public static String convertInputToIntegerAndConvertToHex(String input) {
        if (input.isEmpty()) {
            System.err.println("Please enter an integer.");
            throw new InputMismatchException();
        }
        try {
            arg1 = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.err.println("Argument " + input + " must be an integer.");
            throw new NumberFormatException();
        }
        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem, num;
        num = arg1;
        String hexadecimal = "";
        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while (num != 0) {
            rem = num % 16;
            hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }
        System.out.println("Hexadecimal representation is : " + hexadecimal);
        return hexadecimal;
    }
}