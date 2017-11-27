package main.com.sshkim.algorithm;

/**
 * Created by sshkim on 2017. 1. 26..
 * 어떤 자연수 n이 있을 때, d(n)을 n의 각 자릿수 숫자들과 n 자신을 더한 숫자라고 정의하자.
 * 예를 들어
 * d(91) = 9 + 1 + 91 = 101
 * 이 때, n을 d(n)의 제네레이터(generator)라고 한다. 위의 예에서 91은 101의 제네레이터이다.
 * 어떤 숫자들은 하나 이상의 제네레이터를 가지고 있는데, 101의 제네레이터는 91 뿐 아니라 100도 있다. 그런데 반대로, 제네레이터가 없는 숫자들도 있으며, 이런 숫자를 인도의 수학자 Kaprekar가 셀프 넘버(self-number)라 이름 붙였다.
 * 예를 들어 1,3,5,7,9,20,31 은 셀프 넘버 들이다.
 * 1 이상이고 5000 보다 작은 모든 셀프 넘버들의 합을 구하라.
 */
public class SelfNumber {
    /**
     * 1 + 1 =  2
     * 2 + 2 =  4
     * 3 + 3 =  6
     * ....
     * 9 + 9 = 18
     *
     *
     * 1 + 0 + 10 = 11
     * 1 + 1 + 11 = 13
     * 1 + 2 + 12 = 15
     * 1 + 3 + 13 = 17
     * .....
     * 1 + 9 + 19 = 29
     *
     *
     * 2 + 0 + 20 = 22
     * 2 + 1 + 21 = 24
     * .....
     * 2 + 9 + 29 = 40
     *
     *
     * 3 + 0 + 30 = 33
     *
     * 9 + 9 + 99 = 117
     * 1 + 0 + 0 + 100 = 101
     * 1 + 0 + 1 + 101 = 103
     */
    public static void main(String[] args) {
        SelfNumber selfNumber = new SelfNumber();
        selfNumber.findSelfNumber(1, 5000);
    }

    private void findSelfNumber(int start, int end) {

        for (int i = 0; i < end; i++) {
            int num = checkSelfNumber(i);
        }

    }

    private int checkSelfNumber(int num) {
        int i = 1;
        while (num != 0) {
            num %= i;
        }

        String sNum = num + "";
        String[] numArr = sNum.split("");


        return 0;
    }
}
