package sortAlgorithm;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        quickSort(array, 0, array.length);
        System.out.print(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int startIndex, int endIndex) {
        if (endIndex - startIndex < 2) {
            return;
        }
        int pivotIndex = partition(array, startIndex, endIndex);
        quickSort(array, startIndex, pivotIndex);
        quickSort(array, pivotIndex + 1, endIndex);
    }

    private static int partition(int[] array, int startIndex, int endIndex) {
        int pivot = array[startIndex];
        int i = startIndex;
        int j = endIndex;

        while (i < j) {
            while (i < j && array[--j] >= pivot) ;
            if (i < j) {
                array[i] = array[j];
            }
            while (i < j && array[++i] <= pivot) ;
            if (i < j) {
                array[j] = array[i];
            }
        }
        array[j] = pivot;
        return j;
    }
}
