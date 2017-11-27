package main.com.sshkim.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sshkim on 2016. 11. 7..
 */
public class Calculator {

    public static String calculate(String equation) {
        double result = 0;
        String tmp = equation.replace(" ", "");

        List<String> list = new ArrayList<>();

        char[] chars = tmp.toCharArray();

        StringBuilder sb = new StringBuilder();
        boolean startIdx = false;
        boolean endIdx = false;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                startIdx = true;
            } else {
                sb.append(chars[i]);
            }

            if (startIdx) {
                if (sb.length() > 0) {
                    list.add(sb.toString());
                    sb = new StringBuilder();
                }
                list.add(chars[i] + "");
                startIdx = false;

            }
        }
        list.add(sb.toString());

        return getCalculate(list);
    }

    private static String getCalculate(List<String> list) {

        boolean containBucket = true;
        while (containBucket) {
            containBucket = false;
            int lTmpIdx = 0, rTmpIdx = 0;
            List<String> tmpList = new ArrayList<>();
            for (int i = 0; i < list.size() && !containBucket; i++) {
                if (list.get(i).contains("(")) {
                    lTmpIdx = i;
                } else if (list.get(i).contains(")")) {
                    rTmpIdx = i;
                }

                if (lTmpIdx != 0 && rTmpIdx != 0) {
                    tmpList = list.subList(lTmpIdx + 1, rTmpIdx);
                    containBucket = true;
                    break;
                }
            }
            if (containBucket) {
                getRegex(tmpList);
                list.remove(lTmpIdx);
                list.remove(rTmpIdx-3);
            }
        }

        return getRegex(list);
    }

    private static String getRegex(List<String> list) {
        double tmpNum = 0;
        int i = 0;
        for (i = 0; i < list.size(); i++) {
            if (list.get(i).contains("*") || list.get(i).contains("/")) {
                switch (list.get(i)) {
                    case "*":
                        tmpNum = Double.parseDouble(list.get(i - 1)) * Double.parseDouble(list.get(i + 1));
                        list.remove(i + 1);
                        list.remove(i - 1);
                        list.set(i - 1, tmpNum + "");
                        break;
                    case "/":
                        tmpNum = Double.parseDouble(list.get(i - 1)) / Double.parseDouble(list.get(i + 1));
                        list.remove(i + 1);
                        list.remove(i - 1);
                        list.set(i - 1, tmpNum + "");
                        break;
                }
            }
        }

        i = 0;
        while (list.size() > 1) {
            switch (list.get(i)) {
                case "+":
                    tmpNum = Double.parseDouble(list.get(i - 1)) + Double.parseDouble(list.get(i + 1));
                    list.remove(i + 1);
                    list.remove(i - 1);
                    list.set(i - 1, tmpNum + "");
                    i = 0;
                    break;
                case "-":
                    tmpNum = Double.parseDouble(list.get(i - 1)) - Double.parseDouble(list.get(i + 1));
                    list.remove(i + 1);
                    list.remove(i - 1);
                    list.set(i - 1, tmpNum + "");
                    i = 0;
                    break;
            }
            i++;
        }

        return list.get(0).toString();
    }
}
