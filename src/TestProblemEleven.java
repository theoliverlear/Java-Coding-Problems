// Oliver Sigwarth
// Problem 11: Checking Whether a String is a Palindrome
// Exercise from "Java Coding Problems" by Anghel Leonard
// Created: 4/11/2023
// Modified: 4/11/2023
// ------------------------------------------------------------------------------
//                                  Objective
// Write a program that determines whether the given string is a palindrome
// or not.
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestProblemEleven {
        ProblemEleven testProblemEleven = new ProblemEleven("David");
        @Test
        public void testIsPalindrome() {
            assertEquals(false, testProblemEleven.isPalindrome());
            testProblemEleven.setPhrase("Racecar");
            assertEquals(true, testProblemEleven.isPalindrome());
        }
    }