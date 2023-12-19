// Oliver Sigwarth
// Problem 15: Sorting an Array of Strings by Length
// Exercise from "Java Coding Problems" by Anghel Leonard
// Created: 4/17/2023
// Modified: 4/17/2023
// ---------------------------------------------------------------------------
//                                Objective
// Write a program that sorts by the length of the given array of strings.
import java.util.ArrayList;
import java.util.Comparator;
public class ProblemFifteen {
    public static ArrayList<String> sortStrings(String[] phrases) {
        ArrayList<String> strings = new ArrayList<>();
        for (String phrase : phrases) {
            strings.add(phrase);
        }
        strings.sort(Comparator.comparingInt(String::length));
        return strings;
    }
    public static void main(String[] args) {
        String[] phrases = {"B", "Buffoon", "car", "heartless", "trim"};
        System.out.println(sortStrings(phrases));
    }
}
