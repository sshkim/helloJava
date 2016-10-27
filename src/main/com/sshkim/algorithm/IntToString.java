package main.com.sshkim.algorithm;

import org.junit.Assert;

/**
 * Created by sshkim on 2016. 10. 19..
 */
public class IntToString {

    /**
     * Explain is below...
     *
     *
     * A = 0, B = 1, C = 2 ...     Z = 25                                   Total : 26
     * AA = 26, AB = 27 ...        ZZ = 26 * 26 + 25                        Total : 26 * 26
     * AAA = 702, AAB = 703 ...    ZZZ = (26 * 26 * 26) + (26 * 26 + 25)    Total : 26 * 26 * 26
     * .
     * .
     * .
     * .
     */

    private static final int totalAlpabets = 26;


    public static void main(String[] args) {

        int num = 25;

        String result = toAlphabet(num);

        Assert.assertEquals("Z", result);

    }

    private static String toAlphabet(int num) {
        StringBuilder sb = new StringBuilder();
        int realNumber = num + 1;
        int remainder;
        while (realNumber > 0) {
            remainder = realNumber % totalAlpabets;

            if (remainder == 0) {
                sb.insert(0, "Z");
                realNumber -= totalAlpabets;
            } else {
                sb.insert(0, (char) ('A' + (remainder - 1)));
            }

            realNumber /= totalAlpabets;

        }
        return sb.toString();
    }

}
