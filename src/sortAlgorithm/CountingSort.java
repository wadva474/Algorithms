package sortAlgorithm;

import java.util.Arrays;

//This can only be used with Positive whole number
public class CountingSort {
    public static void main(String[] args) {
        int[] array = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
        countingSort(array, 1, 10);
        System.out.print(Arrays.toString(array));
    }

    public static void countingSort(int[] input, int min, int max) {
        int[] count = new int[(max - min) + 1];
        for (int i = 0; i < input.length; i++) {
            count[input[i] - min]++;
        }
        int j = 0;
        for (int i = min; i <= max; i++) {
            while (count[i - min] > 0) {
                input[j++] = i;
                count[i - min]--;
            }
        }
    }
}
