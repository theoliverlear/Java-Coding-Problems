// Oliver Sigwarth
// Problem 4: Counting Vowels and Consonants
// Exercise from "Java Coding Problems" by Anghel Leonard
// Created: 3/20/2023
// Modified: 3/20/2023
// ---------------------------------------------------------------------------
//                                Objective
// Write a program that counts the number of vowels and consonants in a given
// string. Do this for the English language which has five vowels.
public class ProblemFive {
    public static void main(String[] args) {
        String phrase = "David is the best husband ever. I love him so much.";
        int consonantCount = 0;
        int vowelCount = 0;
        char[] phraseArray = phrase.toCharArray();
        for (char character : phraseArray) {
            if (Character.isLetter(character)) {
                if (character == 'a' || character == 'e' || character == 'i'
                                     || character == 'o' || character == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        if (consonantCount == 1 && vowelCount == 1) {
            System.out.println("The phrase \"" + phrase + "\" contains " + consonantCount + " consonant and " + vowelCount + " vowel.");
        } else if (consonantCount == 1 && vowelCount != 1) {
            System.out.println("The phrase \"" + phrase + "\" contains " + consonantCount + " consonant and " + vowelCount + " vowels.");
        } else if (consonantCount != 1 && vowelCount == 1) {
            System.out.println("The phrase \"" + phrase + "\" contains " + consonantCount + " consonants and " + vowelCount + " vowel.");
        } else if (consonantCount != 1 && vowelCount != 1) {
            System.out.println("The phrase \"" + phrase + "\" contains " + consonantCount + " consonants and " + vowelCount + " vowels.");
        }

    }
}