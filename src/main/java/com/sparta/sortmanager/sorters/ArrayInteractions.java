package com.sparta.sortmanager.sorters;

import java.util.Arrays;
import java.util.Random;

public class ArrayInteractions implements SortRandomArray {
    private int[] generatedArray;
    private int[] sortedArray;

    public ArrayInteractions(int arrayLength) {
        // Already ensured input will be >= 1
        Random r = new Random();

        int[] randomArray = new int[arrayLength];

        for (int i=0 ; i<arrayLength ; i++) {
            randomArray[i] = r.nextInt(-100, 101);
        }

        this.generatedArray = randomArray;
        this.sortedArray = Arrays.copyOf(randomArray, randomArray.length);
    }

    public int[] getGeneratedArray() {
        return generatedArray;
    }

    public int[] getSortedArray() {
        return sortedArray;
    }

    public void setSortedArray(int[] sortedArray) {
        this.sortedArray = sortedArray;
    }

    @Override
    public void sortRandomArray(){}

}
