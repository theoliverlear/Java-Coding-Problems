// Oliver Sigwarth
// Problem 13: Removing Duplicate Characters
// Exercise from "Java Coding Problems" by Anghel Leonard
// Created: 4/12/2023
// Modified: 4/16/2023
// ---------------------------------------------------------------------------
//                                Objective
// Write a program that removes the duplicate character from the string.
import org.junit.Test;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
public class ProblemTwelveTest {
    ProblemTwelve testPhrase = new ProblemTwelve("Oliver Sigwarth");
    @Test
    public void testRemoveDuplicateChars() {
        testPhrase.removeDuplicateChars();
        assertEquals("Oliver Sgwath", testPhrase.toString());
    }
}
