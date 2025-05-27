package test;

import main.mergeStringsAlternately.Solution;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringsAlternatelyTest {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "abc, pqr, apbqcr",
            "ab, pqrs, apbqrs",
            "abcd, pq, apbqcd",
            "'', '', ''",
            "'', abc, abc",
            "xyz, '', xyz",
            "a, b, ab",
            "xy, mn, xmyn",
            "hello, ab, haebllo",
            "ab, hello, ahbello",
            "a1b2, c3d4, ac13bd24",
            "a!c, @#%, a@!#c%",
            "你好吗, hello, 你h好e吗llo"
    })
    void testMergeAlternately(String word1, String word2, String expected) {
        String result = solution.mergeAlternately(word1, word2);
        assertEquals(expected, result);
    }
}