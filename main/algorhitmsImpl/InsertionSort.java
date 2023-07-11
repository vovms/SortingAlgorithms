package main.algorhitmsImpl;

import main.SortAlgorithm;

public class InsertionSort implements SortAlgorithm {

    //https://www.geeksforgeeks.org/insertion-sort/
    @Override
    public void sort(int[] array) {
        // int[] array = {4,3,2,10,12,1,5,6};
        for (int i = 0; i < array.length - 1; i++){
            boolean swapped = array[i] > array[i + 1];
            if (swapped) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }else continue;

            int j = i;
            while (j > 0 && array[j] < array[j-1]){
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
                j--;
            }
        }

    }
}
