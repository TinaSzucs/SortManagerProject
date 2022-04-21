package com.sparta.sortmanager.sorters;

import com.sparta.sortmanager.sorters.SortRandomArray;

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

    /*
        switch between Array-ArrayList?
    */

    /*
        String Builder for neater print?
     */
    public void printRandomArray() {
        System.out.println("Randomly generated array:");
        for (int number: this.getGeneratedArray()) {
            System.out.printf("%d, ", number);
        }
        System.out.println();
    }

    public void printSortedArray() {
        if (this.getSortedArray() == null) {
            System.out.println("Make sure you have sorted the array before trying to print it.");
        } else {
            System.out.println("The array after sort:");
            for (int number: this.getSortedArray()) {
                System.out.printf("%d, ", number);
            }
        }
    }

    @Override
    public void sortRandomArray(){}

}
