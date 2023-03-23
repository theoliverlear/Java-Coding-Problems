// Oliver Sigwarth
// Problem 8: Removing Whitespace From a String
// Exercise from "Java Coding Problems" by Anghel Leonard
// Created: 3/22/2023
// Modified: 3/22/2023
// ------------------------------------------------------------------------------
//                                  Objective
// Write a program that removes all the whitespaces from the given string.
public class ProblemEight {
    public static void main(String[] args) {
        String phrase = "David is the best husband ever. I love him so much.";
        String[] phraseSplit = phrase.split(" ");
        String updatedPhase = "";
        for (String singlePhase : phraseSplit) {
            updatedPhase += singlePhase;
        }
        System.out.println(updatedPhase);
    }
}