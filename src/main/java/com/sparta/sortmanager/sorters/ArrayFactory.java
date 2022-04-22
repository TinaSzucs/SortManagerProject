package com.sparta.sortmanager.sorters;

import com.sparta.sortmanager.sorters.binarytree.BinaryTreeSort;

/*
System.out.println("\t1. Bubble Sort");
System.out.println("\t2. Merge Sort");
System.out.println("\t3. Binary Tree Sort");
*/
public class ArrayFactory {
    public static ArrayInteractions getSortMethod(int chosenSort, int arrayLength) {
        switch(chosenSort) {
            case 1 -> {return new BubbleSort(arrayLength);}
            case 2 -> {return new MergeSort(arrayLength);}
            case 3 -> {return new BinaryTreeSort(arrayLength);}
            default -> {return null;}
        }
    }
}
