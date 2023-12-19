// Oliver Sigwarth
// Problem 3: Reversing Letters and Words
// Exercise from "Java Coding Problems" by Anghel Leonard
// Created: 3/18/2023
// Modified: 4/12/2023
// ---------------------------------------------------------------------------
//                                Objective
// Write a program that reverses the letters of each word and a program that
// reverses the letters of each word and the words themselves.
import java.util.*;
public class ProblemThree {
    public static String reverseLettersAndWords(String phrase) {
        String returnPhrase = "";
        String[] phraseArray = phrase.split(" ");
        ArrayList<String> phraseArrayList = new ArrayList<>();
        ArrayList<String> phraseArrayListReversed = new ArrayList<>();
        for (String singlePhrase : phraseArray) {
            if (singlePhrase.contains(".")) {
                StringBuilder singlePhraseBuilder = new StringBuilder(singlePhrase);
                singlePhraseBuilder.deleteCharAt(singlePhraseBuilder.length() - 1);
                singlePhraseBuilder.insert(0, '.');
                phraseArrayList.add(singlePhraseBuilder.toString());
            } else if(singlePhrase.contains(",")) {
                StringBuilder singlePhraseBuilder = new StringBuilder(singlePhrase);
                singlePhraseBuilder.deleteCharAt(singlePhraseBuilder.length() - 1);
                singlePhraseBuilder.insert(0, ',');
                phraseArrayList.add(singlePhraseBuilder.toString());
            } else {
                phraseArrayList.add(singlePhrase);
            }
        }
        for (int i = phraseArrayList.size(); i > 0; i--) {
            phraseArrayListReversed.add(phraseArrayList.get(i - 1));
        }
        for (String singlePhrase : phraseArrayListReversed) {
            returnPhrase += singlePhrase + " ";
        }
        return reverseLetters(returnPhrase);
    }
    public static String reverseLetters(String phrase) {
        String returnPhrase = "";
        String[] phraseArray = phrase.split(" ");
        char[] fullCharacterArray = phrase.toCharArray();
        ArrayList<Character> fullCharacterArrayList = new ArrayList<>();
        for (char singleLetter : fullCharacterArray) {
            fullCharacterArrayList.add(singleLetter);
        }
        ArrayList<Integer> periodIndex = new ArrayList<>();
        ArrayList<Integer> commaIndex = new ArrayList<>();
        ArrayList<Integer> leftParIndex = new ArrayList<>();
        ArrayList<Integer> rightParIndex = new ArrayList<>();
        ArrayList<Integer> leftSqrIndex = new ArrayList<>();
        ArrayList<Integer> rightSqrIndex = new ArrayList<>();
        ArrayList<Integer> leftCurlIndex = new ArrayList<>();
        ArrayList<Integer> rightCurlIndex = new ArrayList<>();
        HashMap<Character, ArrayList<Integer>> punctuation = new HashMap<>();
        for (int i = 0; i < fullCharacterArrayList.size(); i++) {
            if (fullCharacterArrayList.get(i).equals('.')) {
                periodIndex.add(i);
            } else if (fullCharacterArrayList.get(i).equals(',')) {
                commaIndex.add(i);
            } else if (fullCharacterArrayList.get(i).equals('(')) {
                leftParIndex.add(i);
            } else if (fullCharacterArrayList.get(i).equals(')')) {
                rightParIndex.add(i);
            } else if (fullCharacterArrayList.get(i).equals('[')) {
                leftSqrIndex.add(i);
            } else if (fullCharacterArrayList.get(i).equals(']')) {
                rightSqrIndex.add(i);
            } else if (fullCharacterArrayList.get(i).equals('{')) {
                leftCurlIndex.add(i);
            } else if (fullCharacterArrayList.get(i).equals('}')) {
                rightCurlIndex.add(i);
            }
        }
        punctuation.put('.', periodIndex);
        punctuation.put(',', commaIndex);
        punctuation.put('(', leftParIndex);
        punctuation.put(')', rightParIndex);
        punctuation.put('[', leftSqrIndex);
        punctuation.put(']', rightSqrIndex);
        punctuation.put('{', leftCurlIndex);
        punctuation.put('}', rightCurlIndex);
        String updatedPhrase = "";
        for (char character : fullCharacterArrayList) {
            updatedPhrase += character;
        }
        updatedPhrase = updatedPhrase.replace('.', ' ');
        updatedPhrase = updatedPhrase.replace(',', ' ');
        updatedPhrase = updatedPhrase.replace('(', ' ');
        updatedPhrase = updatedPhrase.replace(')', ' ');
        updatedPhrase = updatedPhrase.replace('[', ' ');
        updatedPhrase = updatedPhrase.replace(']', ' ');
        updatedPhrase = updatedPhrase.replace('{', ' ');
        updatedPhrase = updatedPhrase.replace('}', ' ');
        String[] phraseArrayUpdated = updatedPhrase.split(" ");
        for (String singlePhrase : phraseArrayUpdated) {
            StringBuilder phraseStringBuilder = new StringBuilder(singlePhrase);
            returnPhrase += phraseStringBuilder.reverse() + " ";
        }
        StringBuilder fullPhraseWPeriods = new StringBuilder(returnPhrase);
        for (int i = 0; i < punctuation.get('.').size(); i++) {
            fullPhraseWPeriods.deleteCharAt(punctuation.get('.').get(i));
            fullPhraseWPeriods.insert(punctuation.get('.').get(i), String.valueOf('.'));
        }
        StringBuilder fullPhraseWPeriodsCommas = new StringBuilder(fullPhraseWPeriods);
        for (int i = 0; i < punctuation.get(',').size(); i++) {
            fullPhraseWPeriodsCommas.deleteCharAt(punctuation.get(',').get(i));
            fullPhraseWPeriodsCommas.insert(punctuation.get(',').get(i), String.valueOf(','));
        }
        StringBuilder fullPhraseWPeriodsCommasOne = new StringBuilder(fullPhraseWPeriodsCommas);
        for (int i = 0; i < punctuation.get('(').size(); i++) {
            fullPhraseWPeriodsCommasOne.deleteCharAt(punctuation.get('(').get(i));
            fullPhraseWPeriodsCommasOne.insert(punctuation.get('(').get(i), String.valueOf('('));
        }
        StringBuilder fullPhraseWPeriodsCommasTwo = new StringBuilder(fullPhraseWPeriodsCommasOne);
        for (int i = 0; i < punctuation.get(')').size(); i++) {
            fullPhraseWPeriodsCommasTwo.deleteCharAt(punctuation.get(')').get(i));
            fullPhraseWPeriodsCommasTwo.insert(punctuation.get(')').get(i), String.valueOf(')'));
        }
        StringBuilder fullPhraseWPeriodsCommasThree = new StringBuilder(fullPhraseWPeriodsCommasTwo);
        for (int i = 0; i < punctuation.get('[').size(); i++) {
            fullPhraseWPeriodsCommasThree.deleteCharAt(punctuation.get('[').get(i));
            fullPhraseWPeriodsCommasThree.insert(punctuation.get('[').get(i), String.valueOf('['));
        }
        StringBuilder fullPhraseWPeriodsCommasFour = new StringBuilder(fullPhraseWPeriodsCommasThree);
        for (int i = 0; i < punctuation.get(']').size(); i++) {
            fullPhraseWPeriodsCommasFour.deleteCharAt(punctuation.get(']').get(i));
            fullPhraseWPeriodsCommasFour.insert(punctuation.get(']').get(i), String.valueOf(']'));
        }
        StringBuilder fullPhraseWPeriodsCommasFive = new StringBuilder(fullPhraseWPeriodsCommasFour);
        for (int i = 0; i < punctuation.get('{').size(); i++) {
            fullPhraseWPeriodsCommasFive.deleteCharAt(punctuation.get('{').get(i));
            fullPhraseWPeriodsCommasFive.insert(punctuation.get('{').get(i), String.valueOf('{'));
        }
        StringBuilder fullPhraseWPeriodsCommasSix = new StringBuilder(fullPhraseWPeriodsCommasFive);
        for (int i = 0; i < punctuation.get('}').size(); i++) {
            fullPhraseWPeriodsCommasSix.deleteCharAt(punctuation.get('}').get(i));
            fullPhraseWPeriodsCommasSix.insert(punctuation.get('}').get(i), String.valueOf('}'));
        }
        return fullPhraseWPeriodsCommasSix.toString();
    }
    public static void main(String[] args) {
        String phrase = "David is the [best] {husband} (ever). I love him so much. " +
                "He loves me and accepts me, and that's all that matters.";
        System.out.println(reverseLetters(phrase));
        System.out.println("------------------------------------------------------------" +
                           "------------------------------------------------------------");
        System.out.println(reverseLettersAndWords(phrase));
    }
}