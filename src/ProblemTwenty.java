// Oliver Sigwarth
// Problem 20: Concatenating the same string n times
// Exercise from "Java Coding Problems" by Anghel Leonard
// Created: 5/29/2023
// Modified: 5/29/2023
// ------------------------------------------------------------------------------
//                                  Objective
// Write a program that concatenates the same string a given number of times.
public class ProblemTwenty {
    String phrase = "";
    int repeat;
    String phraseConcatenated = "";
    public ProblemTwenty(String phrase, int repeat) {
        this.phrase = phrase;
        this.repeat = repeat;
    }

    public String getPhrase() {
        return this.phrase;
    }
    public int getRepeat() {
        return this.repeat;
    }

    public String getPhraseConcatenated() {
        return this.phraseConcatenated;
    }

    public void setPhraseConcatenated(String phraseConcatenated) {
        this.phraseConcatenated = phraseConcatenated;
    }
    public void concatenateString() {
        String tempPhrase = "";
        for (int i = 0; i < this.getRepeat(); i++) {
            tempPhrase += this.getPhrase();
        }
        this.setPhraseConcatenated(tempPhrase);
    }
    public static void main(String[] args) {
        String phrase = "David is the best husband ever. I love him so much.";
        int repeat = 2;
        ProblemTwenty problemTwenty = new ProblemTwenty(phrase, repeat);
        problemTwenty.concatenateString();
        System.out.println(problemTwenty.getPhraseConcatenated());
    }
}
