package main.com.sshkim.algorithm;

/**
 * Created by sshkim on 2016. 10. 20..
 */

/**
 * 어떤 수 N(1≤N≤1,000,000) 이 주어졌을 때, N의 다음 큰 숫자는 다음과 같습니다.
 * N의 다음 큰 숫자는 N을 2진수로 바꾸었을 때의 1의 개수와 같은 개수로 이루어진 수입니다.
 * 1번째 조건을 만족하는 숫자들 중 N보다 큰 수 중에서 가장 작은 숫자를 찾아야 합니다.
 * 예를 들어, 78을 2진수로 바꾸면 1001110 이며, 78의 다음 큰 숫자는 83으로 2진수는 1010011 입니다.
 * N이 주어질 때, N의 다음 큰 숫자를 찾는 NextBigNumber 함수를 완성하세요.
 */

public class NextBigNumber {


    public int nextBigNumber(int n) {
        StringBuilder binaryNumber = toBinary(n);
        System.out.println("Binary Number => " + binaryNumber);
        int length = binaryNumber.length();

        boolean flag = false;
        for (int i = length - 1; i >= 0; i--) {
            if (binaryNumber.charAt(i) == '1') {
                flag = true;
                continue;
            }

            if (flag && binaryNumber.charAt(i) == '0') {
                binaryNumber.deleteCharAt(i);
                binaryNumber.insert(i+1, '0');
                break;
            }
        }

        int answer = Integer.valueOf(binaryNumber.toString());

        return answer;
    }

    private StringBuilder toBinary(int n) {
        int number = n;
        StringBuilder sb = new StringBuilder();
        while (true) {
            sb.insert(0, number % 2);
            number = number >> 1;

            if (number == 0)
                break;
        }
        return sb;
    }

    public static void main(Practice1[] args) {
        NextBigNumber test = new NextBigNumber();
        int n = 78;
        System.out.println("BigNumber => " + test.nextBigNumber(n));
    }
}
