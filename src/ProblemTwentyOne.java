// Oliver Sigwarth
// Problem 21: Removing leading and trailing spaces
// Exercise from "Java Coding Problems" by Anghel Leonard
// Created: 5/29/2023
// Modified: 5/29/2023
// ---------------------------------------------------------------------------
//                                Objective
// Write a program that removes the leading and trailing spaces of the given
// string.
public class ProblemTwentyOne {
    String phrase, phraseTrimmed;
    public ProblemTwentyOne(String phrase) {
        this.phrase = phrase;
        this.phraseTrimmed = "";
    }

    public String getPhrase() {
        return this.phrase;
    }

    public String getPhraseTrimmed() {
        return this.phraseTrimmed;
    }
    public void setPhraseTrimmed(String phraseTrimmed) {
        this.phraseTrimmed = phraseTrimmed;
    }
    public void trimString() {
        this.setPhraseTrimmed(this.getPhrase().trim());
    }
    public static void main(String[] args) {
        ProblemTwentyOne problemTwentyOne = new ProblemTwentyOne(
                "                  David is the best husband ever. I love him so much.                       ");
        problemTwentyOne.trimString();
        problemTwentyOne.toString().replace(" ", "").trim().replaceAll("\\s+", " ");
        System.out.println(problemTwentyOne.getPhraseTrimmed());
    }
}
