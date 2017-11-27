package test.dataStructure;

import main.com.sshkim.dataStructure.Sort;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by sshkim on 2017. 1. 3..
 */
public class TestSort {

    public int[] index = {8, 4, 1, 3, 7, 9, 6, 5, 2};
    public int[] result;

    @Test
    public void insertSort(){
        result = Sort.insertionSort(index);

        forEach();
    }

    @Test
    public void selectorSort(){
        result = Sort.selectionSort(index);

        forEach();
    }

    @Test
    public void bubbleSort(){
        result = Sort.bubbleSort(index);

        forEach();
    }

    @Test
    public void quickSort(){
        result = Sort.quickSort(index);

        forEach();
    }

    @Test
    public void mergeSort(){

    }

    @Test
    public void shellSort(){

    }

    private void forEach() {
        Arrays.stream(result).forEach(d->{
            System.out.println(d);
        });
    }
}
