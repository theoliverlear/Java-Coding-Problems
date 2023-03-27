import java.util.ArrayList;

// Oliver Sigwarth
// Problem 10: Generating All Permutations
// Exercise from "Java Coding Problems" by Anghel Leonard
// Created: 3/24/2023
// Modified: 3/24/2023
// ------------------------------------------------------------------------------
//                                  Objective
// Write a program that generates all the permutations of a given string.
public class ProblemTen {

    public static ArrayList<String> makeMovePermutation(String phrase) throws StackOverflowError {
        StringBuilder phraseBuilder = new StringBuilder(phrase);
        ArrayList<String> phrases = new ArrayList<>();
        ArrayList<String> phrasesReversed = new ArrayList<>();
        for (int i = phraseBuilder.length();i > 0; i--) {
            phraseBuilder.insert(0, phraseBuilder.charAt(phraseBuilder.length() - 1));
            phraseBuilder.deleteCharAt(phraseBuilder.length() - 1);
            phrases.add(phraseBuilder.toString());
        }
        for (String string : phrases) {
            StringBuilder stringBuilder = new StringBuilder(string);
            phrasesReversed.add(stringBuilder.reverse().toString());
        }
        phrases.addAll(phrasesReversed);
        return phrases;
    }
    public static void main(String[] args) {
        System.out.println(makeMovePermutation("abc"));
    }
}