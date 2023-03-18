import java.util.ArrayList;
import java.util.Comparator;

// Oliver Sigwarth
// Problem 2: Find The First Non-Repeated Character
// Exercise from "Java Coding Problems" by Anghel Leonard
// Created: 3/17/2023
// Modified: 3/17/2023
// ------------------------------------------------------------------------------
//                                  Objective
// Write a program that returns the first non-repeated character from a given string.
public class ProblemTwo {
    public static char firstNonRepeatedChar(String phrase) {
        ArrayList<Character> firstNonRepeatedChar = new ArrayList<>();
        char[] phraseCharArray = phrase.toCharArray();
        ArrayList<Character> phraseCharArrayList = new ArrayList<>();
        ArrayList<Character> sortPhraseCharArrayList = new ArrayList<>();
        for (char character : phraseCharArray) {
            phraseCharArrayList.add(character);
            sortPhraseCharArrayList.add(character);
        }
        sortPhraseCharArrayList.sort(Comparator.naturalOrder());
        ArrayList<Character> duplicateCharacters = new ArrayList<>();
        for (int i = 0; i < sortPhraseCharArrayList.size(); i++) {
            if (i+1 == sortPhraseCharArrayList.size()) {
                break;
            }
            if (sortPhraseCharArrayList.get(i).equals(sortPhraseCharArrayList.get(i+1))) {
                duplicateCharacters.add(sortPhraseCharArrayList.get(i));
            }
        }
        for (char character : duplicateCharacters) {
            phraseCharArrayList.remove(phraseCharArrayList.indexOf(character));
        }
        firstNonRepeatedChar.add(phraseCharArrayList.get(0));
        return firstNonRepeatedChar.get(0);
    }
    public static void main(String[] args) {
        System.out.println(firstNonRepeatedChar("David is the best husband ever. I love him so much."));
    }
}