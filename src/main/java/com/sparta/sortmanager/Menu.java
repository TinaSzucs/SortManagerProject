package com.sparta.sortmanager;

import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);

    public void printMenu() {
        System.out.println("Welcome to the Sort Manager Project!");
        System.out.println();
        System.out.println("Please choose a sort method from the list bellow.");

        /*
        A for loop to list out all the sort methods?

        just a dummy text for now:
        -> use Enum numbers
        */
        System.out.println("\t1. Bubble Sort");
        System.out.println("\t2. Merge Sort");

        System.out.println();
    }

    public int scanMenuInput() {
        int chosenMenuPoint;

        do {
            System.out.println("Please enter the corresponding number:");
            chosenMenuPoint = scan.nextInt();

            /*
            use list of sorts.length to avoid static number?
            -> enum numbers.length?
             */
        } while ( !(chosenMenuPoint >= 1 && chosenMenuPoint <= 2) );

        return chosenMenuPoint;
    }

    public int scanArrayLength() {
        int arrayLength;

        do {
            System.out.println("Please enter the length of the randomly generated array.");
            arrayLength = scan.nextInt();
        } while (arrayLength <= 0);

        return arrayLength;
    }
}
