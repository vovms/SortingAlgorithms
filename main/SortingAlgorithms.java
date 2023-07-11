package main;

import main.ArrayPrinter;
import main.algorhitmsImpl.BubbleSort;
import main.algorhitmsImpl.InsertionSort;
import main.algorhitmsImpl.SelectionSort;

public class SortingAlgorithms {
    public static void main(String[] args) {
        int[] array = {4,3,2,10,12,1,5,6};
        ArrayPrinter.printArray(array);
         /*
         SelectionSort sortAlgorithm = new SelectionSort();
         sortAlgorithm.sort(array);
         */
//         SortAlgorithm sortAlgorithm = new BubbleSort();
//         sortAlgorithm.sort(array);

        SortAlgorithm sortAlgorithm = new InsertionSort();
        sortAlgorithm.sort(array);
        ArrayPrinter.printArray(array);

    }
}
