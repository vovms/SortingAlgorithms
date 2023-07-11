package main.algorhitmsImpl;

import main.SortAlgorithm;

public class SelectionSort implements SortAlgorithm {

    //https://www.geeksforgeeks.org/selection-sort/
    public void sort(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            int minValue = array[i];
            for (int j = i + 1; j < array.length;j++){
                if (array[j] < minValue){
                    int currentValue = array[j];
                    array[j] = minValue;
                    minValue = currentValue;
                }
                array[i] = minValue;
            }
        }
    }
}
