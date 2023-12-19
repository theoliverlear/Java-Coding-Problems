// Oliver Sigwarth
// Problem 7: Converting String Into Int, Long, Float, or Double
// Exercise from "Java Coding Problems" by Anghel Leonard
// Created: 3/22/2023
// Modified: 3/22/2023
// ---------------------------------------------------------------------------
//                                Objective
// Write a program that converts the given String object (representing a
// number) into int, long, float, or double.
// ---------------------------------------------------------------------------
//                                    Test
import org.junit.Test;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
public class ProblemSevenTest {
    static int phraseInt = 0;
    static long phraseLong = 0;
    static float phraseFloat = 0;
    static double phraseDouble = 0;
    @Test
    public void testConvertInt() {
        assertThat(1, equalTo(convertInt("1")));
        assertThat(12, equalTo(convertInt("12.5")));
        assertThat(2147483647, equalTo(convertInt("100000000000000000000000000000000")));
        assertThat(-2147483648, equalTo(convertInt("-100000000000000000000000000000000")));
    }
    public static int convertInt(String phrase) {
        double safePhrase = Double.parseDouble(phrase);
        try {
            phraseInt = Integer.parseInt(phrase);
            return phraseInt;
        } catch (NumberFormatException e) {
            phraseInt = (int) safePhrase;
            return phraseInt;
        }
    }
    @Test
    public void testConvertLong() {
        assertThat(1L, equalTo(convertLong("1")));
        assertThat(12L, equalTo(convertLong("12.5")));
        assertThat(9223372036854775807L, equalTo(convertLong("9223372036854775808")));
        assertThat(-9223372036854775808L, equalTo(convertLong("-9223372036854775809")));
    }
    public static long convertLong(String phrase) {
        double safePhrase = Double.parseDouble(phrase);
        try {
            phraseLong = Long.parseLong(phrase);
            return phraseLong;
        } catch (NumberFormatException e) {
            phraseLong = (long) safePhrase;
            return phraseLong;
        }
    }
    @Test
    public void testConvertFloat() {
        assertThat(1F, equalTo(convertFloat("1")));
        assertThat(12.5F, equalTo(convertFloat("12.5")));
        assertThat(Float.POSITIVE_INFINITY, equalTo(convertFloat("50000000000000000000000000000000000000000000000000000000000000000")));
        assertThat(Float.NEGATIVE_INFINITY, equalTo(convertFloat("-50000000000000000000000000000000000000000000000000000000000000000")));
        assertThat(0F, equalTo(convertFloat("12..5")));
    }
    public static float convertFloat(String phrase) {
        try {
            phraseFloat = Float.parseFloat(phrase);
            return phraseFloat;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
    @Test
    public void testConvertDouble() {
        assertThat(1D, equalTo(convertDouble("1")));
        assertThat(12.5D, equalTo(convertDouble("12.5")));
        assertThat(50000000000000000000000000000000000000000000000000000000000000000D, equalTo(convertDouble("50000000000000000000000000000000000000000000000000000000000000000")));
        assertThat(-50000000000000000000000000000000000000000000000000000000000000000D, equalTo(convertDouble("-50000000000000000000000000000000000000000000000000000000000000000")));
        assertThat(0D, equalTo(convertDouble("12..5")));
    }
    public static double convertDouble(String phrase) {
        try {
            phraseDouble = Double.parseDouble(phrase);
            return phraseDouble;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
    @Test
    public void testAutoConvert() {
        autoConvert("1");
        assertThat(1, equalTo(phraseInt));

        phraseInt = 0;
        autoConvert("10000000000000");
        assertThat(10000000000000L, equalTo(phraseLong));

        phraseLong = 0;
        autoConvert("-10000000000000");
        assertThat(-10000000000000L, equalTo(phraseLong));

        phraseLong = 0;
        autoConvert("500000000000000000000");
        assertThat(500000000000000000000F, equalTo(phraseFloat));

        phraseFloat = 0;
        autoConvert("12.5");
        assertThat(12.5F, equalTo(phraseFloat));

        phraseFloat = 0;
        autoConvert("-12.5");
        assertThat(-12.5F, equalTo(phraseFloat));

        phraseFloat = 0;
        autoConvert("50000000000000000000000000000000000000000000000000000000000000000.15");
        assertThat(50000000000000000000000000000000000000000000000000000000000000000D, equalTo(phraseDouble));

        phraseDouble = 0;
        autoConvert("-50000000000000000000000000000000000000000000000000000000000000000.15");
        assertThat(-50000000000000000000000000000000000000000000000000000000000000000D, equalTo(phraseDouble));
    }
    public static void autoConvert(String phrase) {
        try {
            phraseInt = Integer.parseInt(phrase);
        } catch (NumberFormatException e) {
            try {
                phraseLong = Long.parseLong(phrase);
            } catch (NumberFormatException f) {
                try {
                    if (Float.parseFloat(phrase) > (3.40282347 * Math.pow(10, 38)) ||
                            Float.parseFloat(phrase) < (-1.40239846 * Math.pow(10, 45))) {
                        try {
                            phraseDouble = Double.parseDouble(phrase);
                        } catch (NumberFormatException g) {
                            throw new NumberFormatException("\n" + g + ": Input is not formatted to match any numerical type.");
                        }
                    } else {
                        try {
                            phraseFloat = Float.parseFloat(phrase);
                        } catch (NumberFormatException h) {
                            try {
                            phraseDouble = Double.parseDouble(phrase);
                        } catch (NumberFormatException g) {
                            throw new NumberFormatException("\n" + g + ": Input is not formatted to match any numerical type.");
                        }
                        }
                    }
                } catch (NumberFormatException h) {
                    throw new NumberFormatException("\n" + h + ": Input is not formatted to match any numerical type.");
                }
            }
        }
    }
}
