package main.com.sshkim.algorithm;

/**
 * Created by sshkim on 2016. 11. 9..
 */
public class Copied {

    /**
     * This solution is the faster I've found. It's similar to how a human sum two binary numbers.
     *
     * The complexity order of this algorithm is O(N) where N is the number of digits of the biggest
     * binary number. This is the faster implementation because we are not parsing data from binary
     * to integer and then from integer to binary.
     *
     * To solve this problem is needed go through the String from right to left, and take always
     * into account the accumulated value of the sum and carry.
     */
    public String sumBinaryNumbersBasedOnCount(String n1, String n2) {
        validateInput(n1, n2);

        StringBuilder result = new StringBuilder();
        int lengthVal1 = n1.length();
        int lengthVal2 = n2.length();
        int length = Math.max(lengthVal1, lengthVal2);
        int carry = 0;
        int sum = 0;
        int remainder = 0;
        for (int i = 0; i < length; i++) {
            //This is a beautiful trick to avoid IndexOutOfBoundExceptions.
            int digit1 = i >= lengthVal1 ? 0 : n1.charAt(lengthVal1 - i - 1) - '0';
            int digit2 = i >= lengthVal2 ? 0 : n2.charAt(lengthVal2 - i - 1) - '0';

            if (digit1 < 2 && digit2 < 2) {
                sum = digit1 + digit2 + carry;
                carry = sum / 2;
                remainder = sum % 2;
                result.append((char) (remainder + '0'));
            } else {
                throw new IllegalArgumentException(
                        "Error parsing input data, review your parameters, should be a valid binary number!");
            }
        }
        if (carry != 0)
            result.append((char) (carry + '0'));
        return result.reverse().toString();
    }

    private void validateInput(String n1, String n2) {
        if (n1 == null || n2 == null) {
            throw new IllegalArgumentException("n1 and n2 parameters can't be null");
        }
    }


}
