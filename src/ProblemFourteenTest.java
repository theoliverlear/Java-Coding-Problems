// Oliver Sigwarth
// Problem 14: Finding the Character with the Most Appearances
// Exercise from "Java Coding Problems" by Anghel Leonard
// Created: 4/16/2023
// Modified: 4/17/2023
// ---------------------------------------------------------------------------
//                                Objective
// Write a program that finds a character with the most appearances
// in the given string.
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProblemFourteenTest {
    ProblemFourteen testPhrase = new ProblemFourteen("ToTheMoon", ' ');
    @Test
    public void testMostCommonChar() {
        testPhrase.mostCommonChar();
        assertEquals('o', testPhrase.getMostCommonChar().charValue());
    }
}
