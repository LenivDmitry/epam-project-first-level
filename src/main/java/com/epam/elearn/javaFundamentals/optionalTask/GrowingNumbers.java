//Optional Task - Task 2
package com.epam.elearn.javaFundamentals.optionalTask;

import java.util.Scanner;

public class GrowingNumbers {
    public static void main(String[] args) {
        Utils utils = new Utils();

        System.out.println("Enter integer numbers");
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        String[] givenNumbers = utils.returnNumberSortedByLength(data);
        System.out.print("numbers in ascending order: ");
        for (String number: givenNumbers) {
            System.out.print(number + " ");
        }
    }
}
