import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

// Oliver Sigwarth
// Problem 20: Concatenating the same string n times
// Exercise from "Java Coding Problems" by Anghel Leonard
// Created: 5/29/2023
// Modified: 5/29/2023
// ------------------------------------------------------------------------------
//                                  Objective
// Write a program that concatenates the same string a given number of times.
public class ProblemTwentyTest {
    ProblemTwenty testProblemTwenty = new ProblemTwenty("Car", 3);
    @Test
    public void testConcatenateString() {
        testProblemTwenty.concatenateString();
        assertThat("CarCarCar", equalTo(testProblemTwenty.getPhraseConcatenated()));
    }
}
