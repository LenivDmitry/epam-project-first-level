//Main Task - Task 2
package com.epam.elearn.java_fundamentals.mainTask;

public class ShowArgumentsReverseOrder {
    public static void main(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(args[i] + " ");
        }
    }
}
