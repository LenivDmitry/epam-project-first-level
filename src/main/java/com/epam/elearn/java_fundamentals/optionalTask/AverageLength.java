//Optional Task - Task 3
package com.epam.elearn.java_fundamentals.optionalTask;

import java.util.Scanner;

public class AverageLength {
    public static void main(String[] args) {
        Utils utils = new Utils();

        System.out.println("Enter integer numbers");
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        String[] givenNumbers = utils.returnNumberSortedByLength(data);

        int sum = 0;
        for (String number : givenNumbers) {
            sum += number.length();
        }

        int averageSum = sum / givenNumbers.length;
        System.out.println("Average length: " + averageSum);

        for (String number : givenNumbers) {
            if (number.length() > averageSum) {
                System.out.println(number + " bigger than average length. Length is " + number.length());
            }
        }
    }
}
