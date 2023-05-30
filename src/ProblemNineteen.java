// Oliver Sigwarth
// Problem 19: Declaring Multiline Strings (Text Blocks)
// Exercise from "Java Coding Problems" by Anghel Leonard
// Created: 4/18/2023
// Modified: 4/21/2023
// ------------------------------------------------------------------------------
//                                  Objective
// Write a program that declares multiline strings or text blocks.
public class ProblemNineteen {
String phrase;
String phraseMultiline;
public ProblemNineteen(String phrase) {
    this.phrase = phrase;
}
public String getPhrase() {
    return this.phrase;
}
public void setPhrase(String phrase) {
    this.phrase = phrase;
}
public String getPhraseMultiline() {
    return this.phraseMultiline;
}
public void setPhraseMultiline(String phraseMultiline) {
    this.phraseMultiline = phraseMultiline;
}
public void toMultiline() {
    this.setPhraseMultiline(phrase.replaceAll("\\.", ".\n"));
}
    public static void main(String[] args) {
        ProblemNineteen problemNineteen = new ProblemNineteen("David is the best husband ever. I love him so much.");
        problemNineteen.toMultiline();
        System.out.println(problemNineteen.getPhraseMultiline());
    }
}
