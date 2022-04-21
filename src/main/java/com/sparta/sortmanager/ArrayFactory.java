package com.sparta.sortmanager;

/*
System.out.println("\t1. Bubble Sort");
System.out.println("\t2. Merge Sort");
*/
public class ArrayFactory {
    public static ArrayInteractions getSortMethod(int chosenSort, int arrayLength) {
        switch(chosenSort) {
            case 1 -> {return new BubbleSort(arrayLength);}
            case 2 -> {return new MergeSort(arrayLength);}
            default -> {return null;}
        }
    }
}
