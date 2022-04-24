package com.sparta.sortmanager.start;

import com.sparta.sortmanager.display.DisplayManager;
import com.sparta.sortmanager.controller.SortManager;

public class Main {
    public static void main(String[] args) {

        /*
        The user is presented with a number of sort algorithms to choose from.
        */
        DisplayManager.printWelcome();

        /*
         Decision is given via the command line (using Scanner).
         */
        SortManager.scanMenuInput();

        /*
        The program will then ask for the length of an array again via the command line.

        The program should then output:
        The unsorted randomly generated array
        The sort algorithm to be used
        The sorted array after the algorithm has been executed
        The time taken
         */
        SortManager.scanArrayLength();
    }
}
