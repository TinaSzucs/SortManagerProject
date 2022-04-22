package com.sparta.sortmanager.sorters.binarytree;

import com.sparta.sortmanager.sorters.ArrayInteractions;

public class BinaryTreeSort extends ArrayInteractions {
    public BinaryTreeSort(int arrayLength) {
        super(arrayLength);
    }

    // Adapter
    @Override
    public void sortRandomArray(){
        int[] arrayToSort = this.getSortedArray();
        int index = 0;

        Tree tree = new Tree(arrayToSort[0]);
        for (int num: arrayToSort) {
            tree.insert(tree.getNode(), num);
        }

        tree.traversingInOrder(tree.getNode(), arrayToSort, index);

        this.setSortedArray(arrayToSort);
    }
}
