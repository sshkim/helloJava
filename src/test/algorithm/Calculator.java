package test.algorithm;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    /**
     * @param args
     */
    public static void main(String[] args) {

        String param = "1+2*3/2+(2*3)-(10/(10-(5-3)))+(20-1)";
        System.out.println("Infix : " + param);
        Calculator cal = new Calculator();
        Queue<String> que = cal.transformPostfix(param);
        Double resultVal = cal.calculatePostfix(que);
        System.out.println("��� : " + resultVal);
        System.out.println(1d + 2d * 3d / 2d + (2d * 3d) - (10d / (10d - (5d - 3d))) + (20d - 1d));
    }


    /**
     * ������ �켱���� ����
     */
    private Map<String, Integer> hashMap = new HashMap<String, Integer>();

    public Calculator() {
        hashMap.put("+", 0);
        hashMap.put("-", 0);
        hashMap.put("*", 1);
        hashMap.put("/", 1);
        hashMap.put("(", -1);
    }


    /**
     * ���� ǥ��� ��ȯ
     *
     * @param String
     * @return Queue
     * # ����ǥ��� ������ ����ǥ��� ���������� ��ȯ ����
     * 1. '('�� ������ '('�� ������ �����ڸ� Stack�� Push �ϰ� �ǿ����ڴ� ��� �Ѵ�.
     * 2. �����ڸ� ������ �ڽź��� �켱 ������ ���� �����ڸ� ������ ���� Stack�� �ִ� �����ڸ� ����ؼ� Pop �ϰ� �ڽ��� ���� ���� ������ �ϰ�� Stack�� Push �Ѵ�.
     * 3. ')'�� ������ '('�� Pop �ɶ� ���� Stack�� �ִ� �����ڸ� ��� Pop �Ͽ� ��� �Ѵ�.
     * 4. �ǿ����ڴ� ��� �Ѵ�.
     * 5. ������ ������ Stack�� �����ִ� ��� �����ڸ� Pop�Ͽ� ��� �Ѵ�.
     */
    public Queue<String> transformPostfix(String param) {
        if (param == null || param.trim().equals(""))
            return null;

        Stack<String> stack = new Stack<String>();

        StringBuilder postfixStr = new StringBuilder();

        Queue<String> postfixQue = new LinkedList<String>();

        Pattern p = Pattern.compile("[0-9]+|\\(|\\)|\\+|\\-|\\*|\\/");
        Matcher m = p.matcher(param);

        while (m.find()) {
            String word = m.group();
            if (word.equals("(")) {
                stack.push(word);
            } else if (hashMap.containsKey(word)) {
                while (true) {
                    if (stack.isEmpty() || hashMap.get(stack.peek()) < hashMap.get(word)) {
                        stack.push(word);
                        break;
                    } else {
                        String popStr = stack.pop();
                        postfixStr.append(popStr);
                        postfixQue.add(popStr);
                    }
                }
            } else if (word.equals(")")) {
                while (true) {
                    String popStr = stack.pop();
                    if (popStr.equals("(")) {
                        break;
                    } else {
                        postfixStr.append(popStr);
                        postfixQue.add(popStr);
                    }
                }
            } else {
                postfixStr.append(word);
                postfixQue.add(word);
            }
        }

        while (stack.isEmpty() == false) {
            String popStr = stack.pop();
            postfixStr.append(popStr);
            postfixQue.add(popStr);
        }

        System.out.println("Postfix : " + postfixStr.toString());
        return postfixQue;
    }


    public Double calculatePostfix(Queue<String> param) {
        Stack<Double> stack = new Stack<Double>();

        Double firstVal;
        Double secondVal;

        while (param.isEmpty() == false) {
            String word = param.remove();

            if (hashMap.containsKey(word)) {
                secondVal = stack.pop();
                firstVal = stack.pop();

                switch (word.charAt(0)) {
                    case '+':
                        stack.push(firstVal + secondVal);
                        break;
                    case '-':
                        stack.push(firstVal - secondVal);
                        break;
                    case '*':
                        stack.push(firstVal * secondVal);
                        break;
                    case '/':
                        stack.push(firstVal / secondVal);
                        break;
                    default:
                        break;
                }

            } else {
                stack.push(Double.valueOf(word));
            }
        }
        return stack.pop();

    }

}
