// Oliver Sigwarth
// Problem 1: Counting Duplicate Characters
// Exercise from "Java Coding Problems" by Anghel Leonard
// Created: 3/17/2023
// Modified: 3/17/2023
// ------------------------------------------------------------------------------
//                                  Objective
// Write a program that counts duplicate characters from a given string.
import java.util.ArrayList;
import java.util.Comparator;
public class ProblemOne {
    public static void main(String[] args) {
        String testString = "David is the best husband ever. I love him so much.";
        char[] testStringCharArray = testString.toCharArray();
        ArrayList<Character> testStringCharArrayList = new ArrayList<>();
        for (char character : testStringCharArray) {
            testStringCharArrayList.add(character);
        }
        testStringCharArrayList.sort(Comparator.naturalOrder());
        ArrayList<Character> duplicateCharacters = new ArrayList<>();
        for (int i = 0; i < testStringCharArrayList.size(); i++) {
            if (i+1 == testStringCharArrayList.size()) {
                break;
            }
            if (testStringCharArrayList.get(i).equals(testStringCharArrayList.get(i+1))) {
                if (duplicateCharacters.contains(testStringCharArrayList.get(i))) {
                    continue;
                } else {
                    duplicateCharacters.add(testStringCharArrayList.get(i));

                }
            }
        }
        System.out.println(duplicateCharacters);
    }
}