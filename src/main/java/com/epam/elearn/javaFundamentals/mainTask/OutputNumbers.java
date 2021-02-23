//Main Task - Task 3
package com.epam.elearn.javaFundamentals.mainTask;

public class OutputNumbers {
    public static void main(String[] args) {
        OutputNumbers outputNumbers = new OutputNumbers();
        int numbersForOutput = 15;
        outputNumbers.printRandomNumbers(numbersForOutput);

    }

    private void printRandomNumbers(int numberForOutput) {
        int limit = 10;
        for (int i = 0; i < numberForOutput; i++) {
            System.out.print((int) (Math.random() * limit) + " ");
        }
        System.out.println("\n");
        for (int i = 0; i < numberForOutput; i++) {
            System.out.println((int) (Math.random() * limit));
        }

    }
}
