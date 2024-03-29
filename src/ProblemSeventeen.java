// Oliver Sigwarth
// Problem 17: Counting Substring Occurrences in a String
// Exercise from "Java Coding Problems" by Anghel Leonard
// Created: 4/17/2023
// Modified: 4/17/2023
// ---------------------------------------------------------------------------
//                                Objective
// Write a program that counts the occurrences of a given string in another string.
public class ProblemSeventeen {
    public static int substringCount(String phrase, String substring) {
        int count = 0;
        for (int i = 0; i < phrase.length()-substring.length(); i++) {
            if (phrase.substring(i, i+substring.length()).contains(substring)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String phrase = """
                The British Empire and the French Republic, linked together in their 
                cause and in their need, will defend to the death their native soil, 
                aiding each other like good comrades to the utmost of their strength.
                Even though large tracts of Europe and many old and famous states have 
                fallen or may fall into the grip of the Gestapo and all the odious 
                apparatus of Nazi rule, we shall not flag or fail. We shall go on to 
                the end, we shall fight in France, we shall fight on the seas and
                oceans, we shall fight with growing confidence and growing strength in
                the air, we shall defend our island, whatever the cost may be. We 
                shall fight on the beaches, we shall fight on the landing grounds,
                we shall fight in the fields and in the streets, we shall fight in 
                the hills; we shall never surrender, and even if, which I do not for
                a moment believe, this island or a large part of it were subjugated
                and starving, then our Empire beyond the seas, armed and guarded by
                the British fleet, would carry on the struggle, until, in God's good 
                time, the new world, with all its power and might, steps forth to the
                 rescue and the liberation of the old.""";
        String substring = "we shall";
        System.out.println(substringCount(phrase, substring));
    }
}
