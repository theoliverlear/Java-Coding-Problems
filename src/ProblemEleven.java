// Oliver Sigwarth
// Problem 11: Checking Whether a String is a Palindrome
// Exercise from "Java Coding Problems" by Anghel Leonard
// Created: 4/11/2023
// Modified: 4/11/2023
// ------------------------------------------------------------------------------
//                                  Objective
// Write a program that determines whether the given string is a palindrome
// or not.
import java.util.ArrayList;
public class ProblemEleven {
    String phrase;
    public ProblemEleven(String phrase) {
        this.phrase = phrase;
    }
    public String getPhrase() {
        return this.phrase;
    }
    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }
    public boolean isPalindrome() {
        char[] asCharArray = getPhrase().toLowerCase().toCharArray();
        ArrayList<Character> charArrayList = new ArrayList<>();
        for (char character : asCharArray) {
            charArrayList.add(character);
        }
        ArrayList<Character> comparatorArrayList = new ArrayList<>();
        for (int i = charArrayList.size() - 1; i >= 0; i--) {
            comparatorArrayList.add(charArrayList.get(i));
        }
        if (charArrayList.equals(comparatorArrayList)) return true;
        else return false;
    }
    public static void main(String[] args) {
        ProblemEleven problemEleven = new ProblemEleven("Racecar");
        System.out.println(problemEleven.isPalindrome());
    }

}
