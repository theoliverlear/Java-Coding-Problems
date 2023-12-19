// Oliver Sigwarth
// Problem 9: Joining Multiple Strings With a Delimiter
// Exercise from "Java Coding Problems" by Anghel Leonard
// Created: 3/24/2023
// Modified: 3/24/2023
// ---------------------------------------------------------------------------
//                                Objective
// Write a program that joins the given strings by the given delimiter.
public class ProblemNine {
    public static void main(String[] args) {
        String[] phrases = {
             "I met a traveller from an antique land,",
             "Who said: “Two vast and trunkless legs of stone",
             "Stand in the desert. Near them, on the sand,",
             "Half sunk, a shattered visage lies, whose frown,",
             "And wrinkled lip, and sneer of cold command,",
             "Tell that its sculptor well those passions read",
             "Which yet survive, stamped on these lifeless things,",
             "The hand that mocked them and the heart that fed;",
             "And on the pedestal these words appear:",
             "\"My name is Ozymandias, king of kings:",
             "Look on my works, ye Mighty, and despair!\"",
             "Nothing beside remains. Round the decay",
             "Of that colossal wreck, boundless and bare,",
             "The lone and level sands stretch far away."
        };
        System.out.println(String.join("--\n--", phrases));
    }
}