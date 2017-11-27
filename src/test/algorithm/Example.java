package test.algorithm;

import org.junit.Test;

import java.util.*;
import java.util.stream.IntStream;

/**
 * Created by sshkim on 2017. 2. 8..
 */
public class Example {
    long startTime = System.currentTimeMillis();

    @Test
    public void hand_11() {

        String lang = "HelloJava";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < lang.length(); i++) {
            sb.append(lang.charAt(i));
            System.out.println(sb.toString());
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }

    @Test
    public void hand_1() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            sb.append('*');
            System.out.println(sb.toString());
        }

        System.out.println(System.currentTimeMillis() - startTime);
    }

    @Test
    public void hand_2() {
        for (int i = 5; 0 < i; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    @Test
    public void hand_3() {
        for (int i = 5; 0 < i; i--) {
            for (int l = i; l < 5; l++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    @Test
    public void hand_4() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    @Test
    public void hand_5() {
        char c = 'A';
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c);
                c += 1;
            }
            System.out.println();
        }
    }

    @Test
    public void hand_6() {
        int limit = 6;

        String c = "*";
        for (int i = 0; i < limit; i++) {

            for (int l = limit - i; l > 1; l--) {
                System.out.print(" ");
            }

            if (i != 0)
                c += "**";

            System.out.println(c);
        }

    }

    @Test
    public void hand_7() {
        int limit = 6;

        String c = "*";
        for (int i = 0; i < limit; i++) {

            for (int l = limit - i; l > 1; l--) {
                System.out.print(" ");
            }

            if (i != 0)
                c += " *";

            System.out.println(c);
        }
    }

    @Test
    public void hand_8() {

        for (int i = 1; i <= 5; i++) {
            for (int l = i; l < 5; l++) {
                System.out.print(" ");
            }
            System.out.print(i);
            for (int n = 1; n < i; n++) {
                System.out.print(" ");
                System.out.print(i);
            }
            System.out.println();
        }
    }

    /**
     * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
     * Find the sum of all the multiples of 3 or 5 below 1000.
     */
    @Test
    public void multipleTest() {
        int sum = 0;

        for (int i = 1; i < 1000; i++) {

            if (i % 3 == 0)
                sum += i;

            if (i % 5 == 0)
                sum += i;

            if (i % 15 == 0)
                sum -= i;

        }
        System.out.println(sum);

        /**
         * 모범답안 java8
         *
         * System.out.println(IntStream.range(1, 1000).filter(j -> j%3==0 || j%5==0).sum());
         */
    }

    /**
     * 1차원의 점들이 주어졌을 때, 그 중 가장 거리가 짧은 것의 쌍을 출력하는 함수를 작성하시오. (단 점들의 배열은 모두 정렬되어있다고 가정한다.)
     * 예를들어 S={1, 3, 4, 8, 13, 17, 20} 이 주어졌다면, 결과값은 (3, 4)가 될 것이다.
     */
    @Test
    public void shortestDistance() {
        int[] ints = {1, 3, 7, 8, 13, 17, 20};

        String pos = ints[0] + ", " + ints[1];
        int shortest = ints[1] - ints[0];
        for (int i = 1; i < ints.length - 1; i++) {
            if (ints[i + 1] - ints[i] < shortest) {
                shortest = ints[i + 1] - ints[i];
                pos = ints[i] + ", " + ints[i + 1];
            }
        }

        System.out.println(pos);
    }


    /**
     * 예로 10 ~ 15 까지의 각 숫자의 개수를 구해보자
     * 10 = 1, 0
     * 11 = 1, 1
     * 12 = 1, 2
     * 13 = 1, 3
     * 14 = 1, 4
     * 15 = 1, 5
     * 그러므로 이 경우의 답은 0:1개, 1:7개, 2:1개, 3:1개, 4:1개, 5:1개
     */
    @Test
    public void numberCount() {
        int limit = 1000;
        Map<Integer, Integer> countMap = new HashMap();
        int target = 0;
        countMap.put(0, 0);
        for (int i = 1; i <= limit; i++) {
            target = i;
            if (i == 1000) {
                countMap.put(target / 1000, countMap.get(target / 1000) + 1);
                target %= 1000;
            }

            if (i >= 100) {
                countMap.put(target / 100, countMap.get(target / 100) + 1);
                target %= 100;
            }

            if (i >= 10) {
                countMap.put(target / 10, countMap.get(target / 10) + 1);
                target %= 10;
            }

            if (i < 10) {
                countMap.put(target, 1);
            } else {
                countMap.put(target, countMap.get(target) + 1);
            }
        }

        Iterator<Integer> it = countMap.keySet().iterator();
        while (it.hasNext()) {
            int tmp = it.next();
            System.out.println(tmp + " / " + countMap.get(tmp));
        }
    }

    /**
     * 예로, 10~15까지의 각 숫자 분해하여 곱하기의 전체 합은 다음과 같다.
     * 10 = 1 * 0 = 0
     * 11 = 1 * 1 = 1
     * 12 = 1 * 2 = 2
     * 13 = 1 * 3 = 3
     * 14 = 1 * 4 = 4
     * 15 = 1 * 5 = 5
     * 그러므로, 이 경우의 답은 0+1+2+3+4+5 = 15
     */
    @Test
    public void splitAndMultiple() {
        int start = 10;
        int end = 1000;

        int target = 0;

        int sum = 0;
        int num = 0;
        for (int i = start; i <= end; i++) {
            num = 1;
            if (i % 10 == 0)
                continue;

            target = i;

            if (i > 100) {
                num = target / 100;
                target %= 100;
            }

            if (i > 10) {
                num *= (target / 10);
                target %= 10;
            }

            num *= target;
            sum = sum + num;

        }
        System.out.println(sum);
    }


    /**
     * 문자열을 입력받아서, 같은 문자가 연속적으로 반복되는 경우에 그 반복 횟수를 표시하여 문자열을 압축하기.
     * 입력 예시: aaabbcccccca
     * 출력 예시: a3b2c6a1
     */
    @Test
    public void zipString() {
        String lang = "aaabbcccccca";
        char[] chars = lang.toCharArray();

        char tmp = chars[0];
        int cnt = 1;
        String result = "";
        for (int i = 1; i < chars.length; i++) {
            if (tmp == chars[i]) {
                cnt++;
            } else {
                result += (tmp + "" + cnt);
                cnt = 1;
                tmp = chars[i];
            }
        }
        result += (tmp + "" + cnt);
        System.out.println(result);
    }

    /**
     * 6, 6 입력 시
     * <p>
     * 0   1   2   3   4   5
     * 19  20  21  22  23   6
     * 18  31  32  33  24   7
     * 17  30  35  34  25   8
     * 16  29  28  27  26   9
     * 15  14  13  12  11  10
     */
    //TODO http://codingdojang.com/scode/266?answer_mode=hide
    @Test
    public void spiralArray() {
        int[] pos = {6, 6};
    }

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
    //TODO http://codingdojang.com/scode/365?answer_mode=hide
    @Test
    public void selfNumbers() {
        int start = 1;
        int end = 5000;

        for (int i = 1; i < 5000 / 10; i++) {

        }

    }

    /**
     * 일전에 뭐 게임 회사에서 본 간단한 퀴즈 테스트 입니다.
     * 0~9까지의 문자로 된 숫자를 입력 받았을 때, 이 입력 값이 0~9까지의 숫자가 각각 한 번 씩만 사용된 것인지 확인하는 함수를 구하시오.
     * <p>
     * sample inputs: 0123456789 01234 01234567890 6789012345 012322456789
     * sample outputs: true false false true false
     */
    @Test
    public void duplicateNumber() {
        String num = "0123456789";
        char[] nums = num.toCharArray();
        boolean result = true;
        int[] cntArr = new int[10];
        int size = nums.length;
        if (size != 10) {
            result = false;
        } else {
            for (int i = 0; i < size; i++) {
                if (cntArr[0] > 1 || cntArr[1] > 1 || cntArr[2] > 1 || cntArr[3] > 1 || cntArr[4] > 1 || cntArr[5] > 1 || cntArr[6] > 1 || cntArr[7] > 1 || cntArr[8] > 1 || cntArr[9] > 1) {
                    result = false;
                    break;
                }
                switch (nums[i]) {
                    case '0':
                        cntArr[0]++;
                        break;
                    case '1':
                        cntArr[1]++;
                        break;
                    case '2':
                        cntArr[2]++;
                        break;
                    case '3':
                        cntArr[3]++;
                        break;
                    case '4':
                        cntArr[4]++;
                        break;
                    case '5':
                        cntArr[5]++;
                        break;
                    case '6':
                        cntArr[6]++;
                        break;
                    case '7':
                        cntArr[7]++;
                        break;
                    case '8':
                        cntArr[8]++;
                        break;
                    case '9':
                        cntArr[9]++;
                        break;
                }
            }
        }
        if (cntArr[0] > 1 || cntArr[1] > 1 || cntArr[2] > 1 || cntArr[3] > 1 || cntArr[4] > 1 || cntArr[5] > 1 || cntArr[6] > 1 || cntArr[7] > 1 || cntArr[8] > 1 || cntArr[9] > 1) {
            result = false;
        }
        System.out.println(result);
    }

    @Test
    public void pibonachi() {
        int n = 10;
        int[] nums = new int[n];
        nums[0] = 0;
        nums[1] = 1;

        for (int i = 2; i < n; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }

        for (int i = 0; i < n; i++) {
            System.out.println(nums[i]);
        }
    }

    @Test
    public void moth() {
        StringBuilder sb = new StringBuilder();
        String lang = ".... .  ... .-.. . . .--. ...  . .- .-. .-.. -.--";
        lang = lang.replaceAll("  ","A|");
        lang = lang.replaceAll(" ", "A");

        String[] langArr = lang.split("A");
        Map<String, Character> map = new HashMap<>();

        map.put(".-", 'A');
        map.put("-...", 'B');
        map.put("-.-.", 'C');
        map.put("-..", 'D');
        map.put(".", 'E');
        map.put("..-.", 'F');
        map.put("--.", 'G');
        map.put("....", 'H');
        map.put("..", 'I');
        map.put(".---", 'J');
        map.put("-.-", 'K');
        map.put(".-..", 'L');
        map.put("--", 'M');
        map.put("-.", 'N');
        map.put("---", 'O');
        map.put(".--.", 'P');
        map.put("--.-", 'Q');
        map.put(".-.", 'R');
        map.put("...", 'S');
        map.put("-", 'T');
        map.put("..-", 'U');
        map.put("...-", 'V');
        map.put(".--", 'W');
        map.put("-..-", 'X');
        map.put("-.--", 'Y');
        map.put("--..", 'Z');
        map.put("|", ' ');

        for (int i = 0; i < langArr.length; i++) {
            Iterator<String> it = map.keySet().iterator();
            while(it.hasNext()){
                String tmp = it.next();
                if(langArr[i].equals(tmp)) {
                    sb.append(map.get(tmp));
                    break;
                }
            }
        }
        System.out.println(sb.toString());
    }

}
