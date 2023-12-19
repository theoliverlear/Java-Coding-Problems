// Oliver Sigwarth
// Problem 18: Checking Whether Two Strings are Anagrams
// Exercise from "Java Coding Problems" by Anghel Leonard
// Created: 4/17/2023
// Modified: 4/18/2023
// ---------------------------------------------------------------------------
//                                Objective
// Write a program that checks whether two strings are anagrams. Ignore
// capitalization and whitespace.
import java.util.ArrayList;
import java.util.Comparator;
public class ProblemEighteen {
    String phraseOne;
    String phraseTwo;
    boolean isAnagram = false;
    public ProblemEighteen(String phraseOne, String phraseTwo) {
        this.phraseOne = phraseOne;
        this.phraseTwo = phraseTwo;
    }
    public String getPhraseOne() {
        return this.phraseOne;
    }
    public void setPhraseOne(String phraseOne) {
        this.phraseOne = phraseOne;
    }
    public String getPhraseTwo() {
        return this.phraseTwo;
    }
    public void setPhraseTwo(String phraseTwo) {
        this.phraseTwo = phraseTwo;
    }
    public boolean getIsAnagram() {
        return this.isAnagram;
    }
    public void setIsAnagram(boolean isAnagram) {
        this.isAnagram = isAnagram;
    }
    public void isAnagram() {
        String stringOne = this.getPhraseOne().toLowerCase();
        String stringTwo = this.getPhraseTwo().toLowerCase();
        String[] stringOneSplit = stringOne.split(" ");
        String[] stringTwoSplit = stringTwo.split(" ");
        String stringFOne = "";
        String stringFTwo = "";
        for (String phrase : stringOneSplit) {
            stringFOne += phrase;
        }
        for (String phrase : stringTwoSplit) {
            stringFTwo += phrase;
        }
        ArrayList<Character> oneAsArray = new ArrayList<>();
        ArrayList<Character> twoAsArray = new ArrayList<>();
        for (char character : stringFOne.toCharArray()) {
            oneAsArray.add(character);
        }
        for (char character : stringFTwo.toCharArray()) {
            twoAsArray.add(character);
        }
        oneAsArray.sort(Comparator.naturalOrder());
        twoAsArray.sort(Comparator.naturalOrder());
        this.setIsAnagram(oneAsArray.equals(twoAsArray));
    }
    public static void main(String[] args) {
        ProblemEighteen phrases = new ProblemEighteen("eat", "tea");
        phrases.isAnagram();
        System.out.println(phrases.getIsAnagram());
    }
}
