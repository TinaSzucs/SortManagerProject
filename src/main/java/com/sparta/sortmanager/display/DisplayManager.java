package com.sparta.sortmanager.display;

public abstract class DisplayManager {

    public static void printWelcome() {
        System.out.println("\nWelcome to the Sort Manager Project!\n\nList of the sort methods:");
        DisplayManager.printMenu();
    }

    public static void printMenu() {
        /*
        A for loop to list out all the sort methods?

        just a dummy text for now:
        -> use Enum numbers
        */
        System.out.println("\t1. Bubble Sort");
        System.out.println("\t2. Merge Sort");
        System.out.println("\t3. Binary Tree Sort");

        System.out.println();
    }

    public static void printInput(int input) {
        System.out.printf("\tThe input is: %d\n\n", input);
    }

    public static void printArray(int[] array) {
        StringBuilder sb = new StringBuilder("[ ");
        for (int i=0 ; i<array.length ; i++) {
            sb.append(array[i]);
            if (i != array.length-1) {
                sb.append(", ");
            }
        }
        sb.append(" ]");

        System.out.println(sb);
    }

    public static void printGeneratedArray(int[] array) {
        System.out.println("The Generated array:");
        printArray(array);
    }

    public static void printSortedArray(int[] array, long time) {
        System.out.println("The Sorted array:");
        printArray(array);

        System.out.printf("The time taken: %d nanoseconds\n", time);
    }

}
