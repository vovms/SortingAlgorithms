package main;

import main.ArrayPrinter;
import main.algorhitmsImpl.BubbleSort;
import main.algorhitmsImpl.SelectionSort;

public class SortingAlgorithms {
     public static void main(String[] args) {
         int[] array = {64,25,12,22,11};
         ArrayPrinter.printArray(array);
         /*
         SelectionSort sortAlgorithm = new SelectionSort();
         sortAlgorithm.sort(array);
         */

         SortAlgorithm sortAlgorithm = new BubbleSort();
         sortAlgorithm.sort(array);
         ArrayPrinter.printArray(array);

    }
}
