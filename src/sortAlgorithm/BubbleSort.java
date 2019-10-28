package sortAlgorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void swap(int[] array, int i, int j) {
        if (i != j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
