// Oliver Sigwarth
// Problem 14: Finding the Character with the Most Appearances
// Exercise from "Java Coding Problems" by Anghel Leonard
// Created: 4/16/2023
// Modified: 4/17/2023
// ---------------------------------------------------------------------------
//                                Objective
// Write a program that finds a character with the most appearances
// in the given string.
import java.util.HashMap;
import java.util.Map;
public class ProblemFourteen {
    String phrase = "";
    Character mostCommonChar;
    public ProblemFourteen(String phrase, Character mostCommonChar) {
        this.phrase = phrase;
        this.mostCommonChar = mostCommonChar;
    }
    public String getPhrase() {
        return this.phrase;
    }
    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }
    public Character getMostCommonChar() {
        return this.mostCommonChar;
    }
    public void setMostCommonChar(Character mostCommonChar) {
        this.mostCommonChar = mostCommonChar;
    }
    public void mostCommonChar() {
        ProblemOne phrase = new ProblemOne(this.getPhrase());
        HashMap<Character, Integer> finalSet = new HashMap<>();
        int highestValue = 0;
        for (int i = 0; i < phrase.duplicateChars().size(); i++) {
            for (Map.Entry<Character, Integer> set : phrase.duplicateChars().get(i).entrySet()) {
                if (set.getValue() > highestValue) {
                    highestValue = set.getValue();
                    finalSet.put(set.getKey(), set.getValue());
                }
            }
        }
        highestValue = 0;
        for (Map.Entry<Character, Integer> set : finalSet.entrySet()) {
            if (set.getValue() > highestValue) {
                this.setMostCommonChar(set.getKey());
            }
        }
    }
    public static void main(String[] args) {
        ProblemFourteen phrase = new ProblemFourteen("David is the best husband ever. I love him so much.",
                                            ' ');
        phrase.mostCommonChar();
        System.out.println("The most common character is \"" + phrase.getMostCommonChar() + "\".");
    }
}
