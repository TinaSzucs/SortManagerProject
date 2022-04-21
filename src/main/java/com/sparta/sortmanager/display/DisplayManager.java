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

        System.out.println();
    }

    public static void printInput(int input) {
        System.out.printf("\tThe input is: %d\n\n", input);
    }

}
