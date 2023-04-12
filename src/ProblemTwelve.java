// Oliver Sigwarth
// Problem 12: Removing Duplicate Characters
// Exercise from "Java Coding Problems" by Anghel Leonard
// Created: 4/12/2023
// Modified: 4/12/2023
// ------------------------------------------------------------------------------
//                                  Objective
// Write a program that removes the given character from a string.
import java.util.ArrayList;
public class ProblemTwelve {
    String phrase;
    char chosenChar;
    public ProblemTwelve(String phrase, char chosenChar) {
        this.phrase = phrase;
        this.chosenChar = chosenChar;
    }
    public String getPhrase() {
        return this.phrase;

    }
    public char getChosenChar() {
        return this.chosenChar;
    }
    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }
    public void setChosenChar(char chosenChar) {
        this.chosenChar = chosenChar;
    }
    public void removeChar() {
        char[] toCharArray = this.getPhrase().toCharArray();
        ArrayList<Character> updatedPhrase = new ArrayList<>();
        String updatedPhraseString = "";
        for (char character : toCharArray) {
            if (character != getChosenChar()) {
                updatedPhrase.add(character);
            }
        }
        for (char character : updatedPhrase) {
            updatedPhraseString += character;
        }
        this.setPhrase(updatedPhraseString);
    }
    public static void main(String[] args) {
        ProblemTwelve phrase = new ProblemTwelve("David is the best husband ever. I love him so much.", 'e');
        phrase.removeChar();
        System.out.println(phrase.getPhrase());
    }
}
