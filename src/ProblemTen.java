// Oliver Sigwarth
// Problem 10: Generating All Permutations
// Exercise from "Java Coding Problems" by Anghel Leonard
// Created: 3/24/2023
// Modified: 4/11/2023
// ------------------------------------------------------------------------------
//                                  Objective
// Write a program that generates all the permutations of a given string.
public class ProblemTen {
    public static void startPermute(String phrase) {
        permute("", phrase);
    }
    public static void permute(String setPhrase, String phrase) {
        if (phrase.length() == 0) {
            System.out.println(setPhrase);
        } else {
            for (int i = 0; i < phrase.length(); i++) {
                permute(setPhrase + phrase.charAt(i),
                          phrase.substring(i + 1, phrase.length()) + phrase.substring(0, i));
            }
        }
    }
    public static void main(String[] args) {
        startPermute("ABC");
    }
}
