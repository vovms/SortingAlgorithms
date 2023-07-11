package main.algorhitmsImpl;

import main.SortAlgorithm;

public class BubbleSort implements SortAlgorithm {

    //https://www.geeksforgeeks.org/bubble-sort/
    @Override
    public void sort(int[] array) {
        boolean swapped;
        for (int i = 0; i < array.length-1; i++){
            swapped = false;
            for (int j = 0; j < array.length-i-1; j++){
                if (array[j] > array[j+1]){
                    int currentValue = array[j];
                    array[j] = array[j+1];
                    array[j+1] = currentValue;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
}
