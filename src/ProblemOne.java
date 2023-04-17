// Oliver Sigwarth
// Problem 1: Counting Duplicate Characters
// Exercise from "Java Coding Problems" by Anghel Leonard
// Created: 3/17/2023
// Modified: 4/16/2023
// ------------------------------------------------------------------------------
//                                  Objective
// Write a program that counts duplicate characters from a given string.
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
public class ProblemOne {
    String phrase;
    public ProblemOne(String phrase) {
        this.phrase = phrase;
    }
    public String getPhrase() {
        return this.phrase;
    }
    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }
    public ArrayList<HashMap<Character, Integer>> duplicateChars() {
        char[] testStringCharArray = this.getPhrase().toCharArray();
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
                duplicateCharacters.add(testStringCharArrayList.get(i));
            }
        }
        ArrayList<Character> addedDuplicates = new ArrayList<>();
        for (int i = 0; i < duplicateCharacters.size(); i++) {
            if (addedDuplicates.contains(duplicateCharacters.get(i))) {
                continue;
            } else {
                addedDuplicates.add(duplicateCharacters.get(i));
            }
        }
        duplicateCharacters.addAll(addedDuplicates);
        duplicateCharacters.sort(Comparator.naturalOrder());
        ArrayList<HashMap<Character, Integer>> duplicateHashMaps = new ArrayList<>();
        for (int i = 0; i < addedDuplicates.size(); i++) {
            int total = 0;
            for (int j = 0; j < duplicateCharacters.size(); j++) {
                if(duplicateCharacters.get(j).equals(addedDuplicates.get(i))) {
                    total++;
                }
            }
            duplicateHashMaps.add(new HashMap<>(Map.of(addedDuplicates.get(i), total)));
        }
        return duplicateHashMaps;
    }
    public static void main(String[] args) {
        ProblemOne phrase = new ProblemOne("David is the best husband ever. I love him so much.");
        String hashMapData = "";
        for (int currentHashMap = 0; currentHashMap < phrase.duplicateChars().size(); currentHashMap++) {
            if (currentHashMap != phrase.duplicateChars().size() - 1) {
                hashMapData += phrase.duplicateChars().get(currentHashMap).toString() + ", ";
            } else {
                hashMapData += phrase.duplicateChars().get(currentHashMap).toString();
            }
        }
        hashMapData = hashMapData.replace('{', '|');
        hashMapData = hashMapData.replace('}', '|');
        hashMapData = hashMapData.replace("=", ": ");
        System.out.println(hashMapData);
    }
}