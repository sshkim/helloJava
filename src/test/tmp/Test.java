package test.tmp;


import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;
import main.com.sshkim.dataStructure.Permutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by sshkim on 2017. 5. 4..
 */
public class Test {

    private int[] numbers = new int[]{8, 4, 1, 3, 7, 9, 6, 5, 2, 10};

    @org.junit.Test
    public void bubble() {
        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
    }

    @org.junit.Test
    public void selector() {
        for (int i = 0; i < numbers.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[index] > numbers[j]) {
                    index = j;
                }
            }
            int tmp = numbers[i];
            numbers[i] = numbers[index];
            numbers[index] = tmp;
        }
    }

    @org.junit.Test
    public void insert() {

    }

    @org.junit.Test
    public void quick() {

    }


}
