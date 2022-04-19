package com.sparta.sortmanager;

public class Main {
    public static void main(String[] args) {

        /*
        The user is presented with a number of sort algorithms to choose from.
        */
        Menu menu = new Menu();
        menu.printMenu();

        /*
         Decision is given via the command line (using Scanner).
         */
        int chosenSort = menu.scanMenuInput();
        System.out.println(chosenSort);

        /*
        The program will then ask for the length of an array again via the command line.
         */
        int arrayLength = menu.scanArrayLength();
        System.out.println(arrayLength);


        /*
        The program should then output:
            The unsorted randomly generated array
            The sort algorithm to be used
            The sorted array after the algorithm has been executed
            The time taken
         */
    }
}
