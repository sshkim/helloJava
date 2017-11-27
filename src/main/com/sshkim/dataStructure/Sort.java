package main.com.sshkim.dataStructure;

/**
 * Created by sshkim on 2016. 10. 25..
 */

// TODO > 정렬 알고리즘
public class Sort {

    public static int[] insertionSort(int[] numbers) {
        int length = numbers.length;
        int number = 0;
        int j;
        for (int i = 1; i < length; i++) {
            number = numbers[i];
            for (j = i - 1; j >= 0 && (number < numbers[j]); j--) {
                numbers[j + 1] = numbers[j];
            }
            numbers[j + 1] = number;
        }

        return numbers;
    }

    public static int[] bubbleSort(int[] numbers) {
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

    public static int[] selectionSort(int[] numbers) {
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

    public static int[] quickSort(int[] numbers) {

        if (numbers.length <= 1 || numbers == null) return numbers;

        quickSort(numbers, 0, numbers.length - 1);

        return numbers;
    }

    private static void quickSort(int[] numbers, int left, int right) {

        if (left >= right) return;

        int i = left;
        int j = right;

        int middle = left + (right - left) / 2;
        int pivot = numbers[middle];

        while (i <= j) {
            while (pivot > numbers[i]) {
                i++;
            }

            while (pivot < numbers[j]) {
                j--;
            }

            if (i <= j) {
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
                i++;
                j--;
            }
        }

        if (j > left)
            quickSort(numbers, left, j);

        if (i < right)
            quickSort(numbers, i, right);

    }

    public static int[] shellSort(int[] numbers) {
        return numbers;
    }

    public static int[] mergeSort(int[] numbers) {
        int[] result = new int[numbers.length - 1];
        return result;
    }

    public static int[] rxSort(int[] numbers) {
        int[] result = new int[numbers.length - 1];
        return result;
    }

    public static int[] heapSort(int[] numbers) {
        int[] result = new int[numbers.length - 1];
        return result;
    }

}
