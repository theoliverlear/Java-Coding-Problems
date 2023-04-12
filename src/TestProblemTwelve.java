// Oliver Sigwarth
// Problem 12: Removing Duplicate Characters
// Exercise from "Java Coding Problems" by Anghel Leonard
// Created: 4/12/2023
// Modified: 4/12/2023
// ------------------------------------------------------------------------------
//                                  Objective
// Write a program that removes the given character from a string.
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestProblemTwelve {
    ProblemTwelve testPhrase = new ProblemTwelve("David is the best husband ever. " +
                                                        "I love him so much.", 'e');
    @Test
    public void testRemoveChar() {
        testPhrase.removeChar();
        assertEquals("David is th bst husband vr. I lov him so much.", testPhrase.getPhrase());
    }
}
