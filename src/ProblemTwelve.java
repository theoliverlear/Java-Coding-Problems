// Oliver Sigwarth
// Problem 13: Removing Duplicate Characters
// Exercise from "Java Coding Problems" by Anghel Leonard
// Created: 4/12/2023
// Modified: 4/16/2023
// ------------------------------------------------------------------------------
//                                  Objective
// Write a program that removes the duplicate character from the string.
import java.util.ArrayList;
public class ProblemTwelve {
    String phrase;
    public ProblemTwelve(String phrase) {
        this.phrase = phrase;
    }
    public String getPhrase() {
        return this.phrase;
    }
    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }
    @Override
    public String toString() {
        return this.getPhrase();
    }
    public void removeDuplicateChars() {
        char[] toCharArray = this.getPhrase().toCharArray();
        ArrayList<Character> toArrayList = new ArrayList<>();
        String asString = "";
        for (char character : toCharArray) {
            if (!toArrayList.contains(character)) {
                toArrayList.add(character);
            }
        }
        for (char character : toArrayList) {
            asString += character;
        }
        this.setPhrase(asString);
    }
    public static void main(String[] args) {
        ProblemTwelve phrase = new ProblemTwelve("David is the best husband ever. I love him so much.");
        phrase.removeDuplicateChars();
        System.out.println(phrase.toString());
    }
}
