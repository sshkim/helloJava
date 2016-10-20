package main.com.sshkim.algorithm;

import org.junit.Assert;

/**
 * Created by sshkim on 2016. 10. 19..
 */
public class AddBinary {
    public static void main(String[] args) {
        String num1 = "100";
        String num2 = "1110";

        int sum = stringToIntByCode(num1, 2) + stringToIntByCode(num2, 2);

        String result = toBinary(sum);
        Assert.assertEquals("10010", result);
    }


    private static String toBinary(int sum) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            sb.append(sum % 2);
            sum = sum >> 1;
            if (sum == 0) {
                break;
            }
        }
        return sb.reverse().toString();
    }

    public static int stringToIntByCode(String number, int code) {
        int length = number.length();
        int result = 0;
        for (int i = 0; i < length; i++) {
            result += Integer.valueOf(number.charAt(i) - '0') * Math.pow(2, length - 1 - i);
        }

        return result;
    }

}
