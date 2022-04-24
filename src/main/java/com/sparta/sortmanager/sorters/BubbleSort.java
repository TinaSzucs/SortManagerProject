package com.sparta.sortmanager.sorters;

public class BubbleSort extends ArrayInteractions {
    public BubbleSort(int arrayLength) {
        super(arrayLength);
    }

    // Adapter
    @Override
    public void sortRandomArray() {
        long start = System.nanoTime();
        int[] arrayToSort = this.getSortedArray();


        int arrayLength = arrayToSort.length;
        int temporaryNumber;

        for (int i=0 ; i<arrayLength ; i++) {
            for (int j=1 ; j<(arrayLength-i) ; j++) {
                if (arrayToSort[j-1] > arrayToSort[j]) {
                    temporaryNumber = arrayToSort[j-1];
                    arrayToSort[j-1] = arrayToSort[j];
                    arrayToSort[j] = temporaryNumber;

                }
            }
        }

        this.setSortedArray(arrayToSort);

        long finish = System.nanoTime();
        this.setTimeTaken(finish-start);
    }
}
