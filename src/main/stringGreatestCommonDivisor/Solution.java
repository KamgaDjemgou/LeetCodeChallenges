package main.stringGreatestCommonDivisor;

public class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String gcd = str1.length() > str2.length() ? str2 : str1;
        while (!gcd.isEmpty() && (cannotDivide(str1, gcd) || cannotDivide(str2, gcd))) {
            gcd = gcd.substring(0, gcd.length() - 1);
        }
        return gcd;
    }

    public static boolean cannotDivide(String dividend, String divisor) {
        return !dividend.matches(String.format("(%s)+", divisor));
    }
}
