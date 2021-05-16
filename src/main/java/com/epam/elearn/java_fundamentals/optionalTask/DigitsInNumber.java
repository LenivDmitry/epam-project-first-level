//Optional Task - Task 4
package com.epam.elearn.java_fundamentals.optionalTask;

import java.util.Scanner;

public class DigitsInNumber {
    public static void main(String[] args) {
        Utils utils = new Utils();

        System.out.println("Enter integer numbers");
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        String[] givenNumbers = utils.returnNumberSortedByLength(data);

        String requiredNumber = givenNumbers[0];
        int amountDigitsRequiredNumber = utils.getUniqueDigitsCount(requiredNumber);

        for (int i = 1; i < givenNumbers.length; i++) {
            int amountDigits = utils.getUniqueDigitsCount(givenNumbers[i]);
            if (amountDigits < amountDigitsRequiredNumber) {
                requiredNumber = givenNumbers[i];
                amountDigitsRequiredNumber = amountDigits;
            }
        }

        System.out.println(requiredNumber + "  - The number which has minimum amount different digits. Amount - " +
                +amountDigitsRequiredNumber);


    }
}
