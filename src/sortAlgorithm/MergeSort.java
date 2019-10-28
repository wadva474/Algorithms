package sortAlgorithm;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        mergeSort(array,0,array.length);
        System.out.print(Arrays.toString(array));
    }

    public static void mergeSort(int[] input, int startingIndex, int endIndex) {
        if (endIndex - startingIndex < 2) {
            return;
        }
        int mid = (startingIndex + endIndex) / 2;
        mergeSort(input, startingIndex, mid);
        mergeSort(input,mid,endIndex);
        merge(input,startingIndex,mid,endIndex);
    }

    private static void merge(int[] input, int startingIndex, int mid, int endIndex) {
        if (input[mid] > input[mid -1]){
            return;
        }
        int i = startingIndex;
        int j = mid;
        int tempIndex= 0 ;

        int [] temp = new int[endIndex - startingIndex];
        while (i < mid && j < endIndex){
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }
        System.arraycopy(input,i,input,startingIndex+ tempIndex,mid-i);
        System.arraycopy(temp,0, input,startingIndex,tempIndex);
    }
}
