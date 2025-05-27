package test;

import main.stringGreatestCommonDivisor.Solution;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringGreatestCommonDivisorTest {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "ABCABC, ABC, ABC",
            "ABABAB, ABAB, AB",
            "LEET, CODE, ''",
    })
    void gcdOfStrings(String word1, String word2, String expected) {
        String result = solution.gcdOfStrings(word1, word2);
        assertEquals(expected, result);
    }
}