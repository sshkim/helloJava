package main.com.sshkim.dataStructure;

/**
 * Created by sshkim on 2016. 10. 25..
 */

// TODO > 정렬 알고리즘
public class Sort {

    private int[] result;

    public static void main(String[] args) {
        int[] index = {8, 4, 7, 3, 1, 6, 5, 2};

        Sort sort = new Sort();
        int[] result = sort.insertionSort(index);

        for (int i : result) {
            System.out.println(i);
        }

    }

    public int[] insertionSort(int[] numbers) {
        int length = numbers.length;
        int number = 0;
        int j;
        for (int i = 1; i < length; i++) {
            number = numbers[i];
            for (j = i - 1; j >= 0 && (number < numbers[j]); j--) {
                numbers[j+1] = numbers[j];
            }
            numbers[j+1] = number;
        }

        return numbers;
    }

    public int[] bubbleSort(int[] numbers) {
        int length = numbers.length;
        int tmp = 0;
        for (int j = 0; j < length; j = 0) {
            for (int i = 0; i < length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    tmp = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = tmp;
                }
            }
            length--;
        }

        return numbers;
    }

    public int[] selectionSort(int[] numbers) {
        int length = numbers.length;

        for (int j = 0; j < length; j++) {
            int minIndex = j;
            for (int i = j + 1; i < length; i++) {
                if (numbers[minIndex] > numbers[i]) {
                    minIndex = i;
                }
            }
            int tmp = numbers[j];
            numbers[j] = numbers[minIndex];
            numbers[minIndex] = tmp;
        }

        return numbers;
    }

    public int[] quickSort(int[] numbers) {
        result = new int[numbers.length - 1];
        return result;
    }

    public int[] shellSort(int[] numbers) {
        return numbers;
    }

    public int[] mergeSort(int[] numbers) {
        result = new int[numbers.length - 1];
        return result;
    }

    public int[] rxSort(int[] numbers) {
        result = new int[numbers.length - 1];
        return result;
    }

    public int[] heapSort(int[] numbers) {
        result = new int[numbers.length - 1];
        return result;
    }

}
