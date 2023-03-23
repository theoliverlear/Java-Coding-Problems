// Oliver Sigwarth
// Problem 7: Converting String Into Int, Long, Float, or Double
// Exercise from "Java Coding Problems" by Anghel Leonard
// Created: 3/22/2023
// Modified: 3/22/2023
// ------------------------------------------------------------------------------
//                                  Objective
// Write a program that converts the given String object (representing a number)
// into int, long, float, or double.
import java.util.Scanner;
public class ProblemSeven {
    static int phraseInt = 0;
    static long phraseLong = 0;
    static float phraseFloat = 0;
    static double phraseDouble = 0;
    public static void convertInt(String phrase) {
        double safePhrase = Double.parseDouble(phrase);
        try {
            phraseInt = Integer.parseInt(phrase);
            System.out.println("The number " + phrase + " has been converted to an integer type as " + phraseInt + ".");
        } catch (NumberFormatException e) {
            phraseInt = (int) safePhrase;
            System.out.println("The number " + phrase + " has been converted to an integer type as " + phraseInt + ".");
        }
    }
    public static void convertLong(String phrase) {
        double safePhrase = Double.parseDouble(phrase);
        try {
            phraseLong = Long.parseLong(phrase);
            System.out.println("The number " + phrase + " has been converted to a long type as " + phraseLong + ".");
        } catch (NumberFormatException e) {
            phraseLong = (long) safePhrase;
            System.out.println("The number " + phrase + " has been converted to a long type as " + phraseLong + ".");
        }
    }
    public static void convertFloat(String phrase) {
        try {
            phraseFloat = Float.parseFloat(phrase);
            System.out.println("The number " + phrase + " has been converted to a float type as " + phraseFloat + ".");
        } catch (NumberFormatException e) {
            System.out.println("The number " + phrase + " cannot be converted to a float type in its current state.");
        }
    }
    public static void convertDouble(String phrase) {
        try {
            phraseDouble = Double.parseDouble(phrase);
            System.out.println("The number " + phrase + " has been converted to a double type as " + phraseDouble + ".");
        } catch (NumberFormatException e) {
            System.out.println("The number " + phrase + " cannot be converted to a double type in its current state.");
        }
    }
    public static void autoConvert(String phrase) {
        try {
            phraseInt = Integer.parseInt(phrase);
        } catch (NumberFormatException e) {
            try {
                phraseLong = Long.parseLong(phrase);
            } catch (NumberFormatException f) {
                try {
                    if (Float.parseFloat(phrase) > (3.40282347 * Math.pow(10, 38)) ||
                            Float.parseFloat(phrase) < (-1.40239846 * Math.pow(10, 45))) {
                        try {
                            phraseDouble = Double.parseDouble(phrase);
                        } catch (NumberFormatException g) {
                            throw new NumberFormatException("\n" + g + ": Input is not formatted to match any numerical type.");
                        }
                    } else {
                        try {
                            phraseFloat = Float.parseFloat(phrase);
                        } catch (NumberFormatException h) {
                            try {
                            phraseDouble = Double.parseDouble(phrase);
                        } catch (NumberFormatException g) {
                            throw new NumberFormatException("\n" + g + ": Input is not formatted to match any numerical type.");
                        }
                        }
                    }
                } catch (NumberFormatException h) {
                    throw new NumberFormatException("\n" + h + ": Input is not formatted to match any numerical type.");
                }
            }
        }
        if (phraseInt != 0) {
            System.out.println("The number " + phrase + " has been converted to an integer type as " + phraseInt + ".");
        } else if (phraseLong != 0) {
            System.out.println("The number " + phrase + " has been converted to a long type as " + phraseLong + ".");
        } else if (phraseFloat != 0) {
            System.out.println("The number " + phrase + " has been converted to a float type as " + phraseFloat + ".");
        } else if (phraseDouble != 0) {
            System.out.println("The number " + phrase + " has been converted to a double type as " + phraseDouble + ".");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number...");
        String phrase = input.nextLine();
        System.out.println("""
                        How do you want to convert your number:
                        | (1)---Automatic |
                        | (2)------Manual |
                        """);
        int choiceAutoManual = Integer.parseInt(input.nextLine());
        int choiceAutoType = 0;
        if (choiceAutoManual == 1) autoConvert(phrase);
        else {
            boolean isValidInput = false;
            while (!isValidInput) {
                System.out.println("""
                        Please choose which type you'd like to convert to:
                        | (1)-----Integer |
                        | (2)--------Long |
                        | (3)-------Float |
                        | (4)------Double |
                        """);
                choiceAutoType = Integer.parseInt(input.nextLine());
                switch (choiceAutoType) {
                    case 1 -> {
                        isValidInput = true;
                        convertInt(phrase);
                    }
                    case 2 -> {
                        isValidInput = true;
                        convertLong(phrase);
                    }
                    case 3 -> {
                        isValidInput = true;
                        convertFloat(phrase);
                    }
                    case 4 -> {
                        isValidInput = true;
                        convertDouble(phrase);
                    }
                    default -> {
                        isValidInput = false;
                        System.out.println("Invalid input, try again.");
                    }
                }
            }
        }
    }
}