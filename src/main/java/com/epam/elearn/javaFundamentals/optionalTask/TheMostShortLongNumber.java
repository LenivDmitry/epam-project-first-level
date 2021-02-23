//Optional Task - Task 1
package com.epam.elearn.javaFundamentals.optionalTask;

import java.util.Scanner;

public class TheMostShortLongNumber {
    public static void main(String[] args) {
        Utils utils = new Utils();

        System.out.println("Enter integer numbers");
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        String[] givenNumbers = utils.returnNumberSortedByLength(data);
        System.out.println("The most short number :" + givenNumbers[0] + " - "
                            + givenNumbers[0].toString().length() + " digits");
        System.out.println("The most long number :" + givenNumbers[givenNumbers.length - 1] + " - "
                            + givenNumbers[givenNumbers.length - 1].toString().length() + " digits");
    }
}
