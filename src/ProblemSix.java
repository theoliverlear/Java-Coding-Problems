// Oliver Sigwarth
// Problem 6: Counting Occurrences of a Certain Character
// Exercise from "Java Coding Problems" by Anghel Leonard
// Created: 3/20/2023
// Modified: 3/20/2023
// ------------------------------------------------------------------------------
//                                  Objective
// Write a program that counts the occurrences of a certain character in a given string.

import java.util.ArrayList;

public class ProblemSix {
    public static void charOccurrencesInString(String phrase, char charChoice) {
        System.out.print("In the phrase, \"" + phrase + "\", ");
        char[] phraseCharArray = phrase.toCharArray();
        ArrayList<Character> filteredPhraseArrayList = new ArrayList<>();
        for (char character : phraseCharArray) {
            if (filteredPhraseArrayList.isEmpty()) {
                filteredPhraseArrayList.add(character);
            } else if (!(filteredPhraseArrayList.contains(character))) {
                filteredPhraseArrayList.add(character);
            }
        }
        ArrayList<ArrayList<Character>> uniqueCharArraylistCount = new ArrayList<>();
        for (int i = 0; i < filteredPhraseArrayList.size(); i++) {
            uniqueCharArraylistCount.add(new ArrayList<>());
        }
        for (int i = 0; i < filteredPhraseArrayList.size(); i++) {
            for (char character : phraseCharArray) {
                if (filteredPhraseArrayList.get(i).equals(character)) {
                    uniqueCharArraylistCount.get(i).add(character);
                }
            }
        }
        for (int i = 0; i < uniqueCharArraylistCount.size(); i++) {
            if (uniqueCharArraylistCount.get(i).contains(charChoice)) {
                if (uniqueCharArraylistCount.get(i).size() == 1) {
                    System.out.println("the character '" + charChoice + "' occurs "
                        + uniqueCharArraylistCount.get(i).size() + " time.");

                } else {
                    System.out.println("the character '" + charChoice + "' occurs "
                        + uniqueCharArraylistCount.get(i).size() + " times.");

                }
            }
        }
    }
    public static void main(String[] args) {
        String phrase = "David is the best husband ever. I love him so much.";
        charOccurrencesInString(phrase, 'e');
    }
}