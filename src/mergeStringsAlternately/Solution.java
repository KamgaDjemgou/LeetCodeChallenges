package mergeStringsAlternately;

public class Solution {
    public String mergeAlternately(String word1, String word2) {
        int pointerOnWord1 = 0, pointerOnWord2 = 0;
        StringBuilder sb = new StringBuilder();
        while(pointerOnWord1 < word1.length() && pointerOnWord2 < word2.length()) {
            sb.append(word1.charAt(pointerOnWord1++)).append(word2.charAt(pointerOnWord2++));
        }

        while(pointerOnWord1 < word1.length()) {
            sb.append(word1.charAt(pointerOnWord1++));
        }

        while(pointerOnWord2 < word2.length()) {
            sb.append(word2.charAt(pointerOnWord2++));
        }

        return sb.toString();
    }
}
