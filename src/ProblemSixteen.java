// Oliver Sigwarth
// Problem 16: Checking that a String Contains a Substring
// Exercise from "Java Coding Problems" by Anghel Leonard
// Created: 4/17/2023
// Modified: 4/17/2023
// ------------------------------------------------------------------------------
//                                  Objective
// Write a program that checks whether the given string contains
// the given substring.
public class ProblemSixteen {
    public static boolean hasSubstring(String phrase, String substring) {
        return phrase.contains(substring);
    }
    public static void main(String[] args) {
        System.out.println(hasSubstring("To infinity and beyond!", "and "));
    }
}
