//Main Task - Task 1
package com.epam.elearn.javaFundamentals.mainTask;

public class Greeting {
    public static void main(String[] args) {
        System.out.print("Hello ");
        for (String name : args) {
            System.out.print(name + " ");
        }
    }
}
