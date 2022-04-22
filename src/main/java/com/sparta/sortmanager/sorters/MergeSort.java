package com.sparta.sortmanager.sorters;
/*
    use System.arraycopy(arrayToSort, 0, leftArrayToSort, 0, midIndex);
 */

public class MergeSort extends ArrayInteractions {
    public MergeSort(int arrayLength) {
        super(arrayLength);
    }

    public static void mergeArrays(int[] arrayToMergeIn, int[] leftArray, int[] rightArray){
        // storing in variables the current indexes the program at
        int leftIndex=0, rightIndex=0, mergeIndex=0;
        //#

        // we keep comparing the numbers until we reached the end of one/both sub arrays
        while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
            if (leftArray[leftIndex] <= rightArray[rightIndex]) {
                arrayToMergeIn[mergeIndex++] = leftArray[leftIndex++];
            } else {
                arrayToMergeIn[mergeIndex++] = rightArray[rightIndex++];
            }
        }

            // if we haven't reached the end of LEFT array
            // we put the remaining numbers from the LEFT array into the merge array
            while (leftIndex < leftArray.length) {
                arrayToMergeIn[mergeIndex++] = leftArray[leftIndex++];
            }

            // if we haven't reached the end of RIGHT array
            // we put the remaining numbers from the RIGHT array into the merge array
            while (rightIndex < rightArray.length) {
                arrayToMergeIn[mergeIndex++] = rightArray[rightIndex++];
            }
    }

    public static void mergeSort(int[] arrayToSort) {
        int arrayLength = arrayToSort.length;

        if (arrayLength < 2) {
            return;
        }

        int midIndex = arrayLength / 2;
        int[] leftArrayToSort = new int[midIndex];
        int[] rightArrayToSort = new int[arrayLength-midIndex];

        for (int i=0 ; i<midIndex; i++) {
            leftArrayToSort[i] = arrayToSort[i];
        }

        for (int i=midIndex ; i<arrayLength ; i++) {
            rightArrayToSort[i-midIndex] = arrayToSort[i];
        }

        mergeSort(leftArrayToSort);
        mergeSort(rightArrayToSort);

        mergeArrays(arrayToSort, leftArrayToSort, rightArrayToSort);
    }

    // Adapter
    @Override
    public void sortRandomArray(){
        int[] arrayToSort = this.getSortedArray();

        mergeSort(arrayToSort);

        this.setSortedArray(arrayToSort);
    }
}
