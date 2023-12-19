// Oliver Sigwarth
// Problem 4: Checking Whether a String Contains Only Digit
// Exercise from "Java Coding Problems" by Anghel Leonard
// Created: 3/19/2023
// Modified: 3/19/2023
// ---------------------------------------------------------------------------
//                                Objective
// Write a program that checks whether the given string is only digits.
public class ProblemFour {
    public static void main(String[] args) {
        boolean onlyDigits = false;
        String phrase = "I was born on the 16th of August, the year 2000.";
        char[] phraseCharArray = phrase.toCharArray();
        for (char character : phraseCharArray) {
            if (character == '0' || character == '1' || character == '2' || character == '3'
                    || character == '4' || character == '5' || character == 6
                    || character == '7' || character == '8' || character == '9') {
                onlyDigits = true;
            } else {
                onlyDigits = false;
                break;
            }
        }
        System.out.println("The string \"" + phrase + "\" contains only" +
                           " digits: " + onlyDigits);
    }
}