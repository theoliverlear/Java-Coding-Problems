// Oliver Sigwarth
// Problem 18: Checking Whether Two Strings are Anagrams
// Exercise from "Java Coding Problems" by Anghel Leonard
// Created: 4/17/2023
// Modified: 4/18/2023
// ------------------------------------------------------------------------------
//                                  Objective
// Write a program that checks whether two strings are anagrams. Ignore
// capitalization and whitespace.
import org.junit.Test;
import static org.junit.Assert.assertTrue;
public class ProblemEighteenTest {
    ProblemEighteen testPhrases = new ProblemEighteen("dog", "god");
    @Test
    public void testIsAnagram() {
        testPhrases.isAnagram();
        assertTrue(testPhrases.getIsAnagram());
    }
}
