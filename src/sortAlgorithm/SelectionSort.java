package sortAlgorithm;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int indexLargest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (array[i] > array[indexLargest]) {
                    indexLargest = i;
                }
            }
            swap(array, indexLargest, lastUnsortedIndex);
        }
        System.out.print(Arrays.toString(array));
    }

    private static void swap(int[] array, int i, int j) {
        if (i != j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
