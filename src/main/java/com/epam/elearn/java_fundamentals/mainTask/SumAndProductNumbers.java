//Main Task - Task 4
package com.epam.elearn.java_fundamentals.mainTask;

public class SumAndProductNumbers {
    public static void main(String[] args) {
        SumAndProductNumbers sumAndProductNumbers = new SumAndProductNumbers();
        System.out.println(sumAndProductNumbers.sumOfNumber(args));
        System.out.println(sumAndProductNumbers.proudOfNumber(args));
    }

    public int sumOfNumber(String[] args) {
        int sum = 0;
        for (String argument : args) {
            sum += Integer.parseInt(argument);
        }
        return sum;
    }

    public int proudOfNumber(String[] args) {
        int proud;
        if (args.length == 0) {
            return proud = 0;
        } else {
            proud = 1;
            for (String argument : args) {
                proud *= Integer.parseInt(argument);
            }
        }
        return proud;
    }


}
