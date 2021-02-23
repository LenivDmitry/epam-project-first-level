//Main Task - Task 5
package com.epam.elearn.javaFundamentals.mainTask;

import java.util.Scanner;

public class MonthSelection {
    public static void main(String[] args) {
        boolean mistake = false;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number from 1 to 12: ");
        do {
            String number = scan.next();
            switch (number) {
                case "1":
                    System.out.println("January");
                    mistake = false;
                    break;
                case "2":
                    System.out.println("February");
                    mistake = false;
                    break;
                case "3":
                    System.out.println("March");
                    mistake = false;
                    break;
                case "4":
                    System.out.println("April");
                    mistake = false;
                    break;
                case "5":
                    System.out.println("May");
                    mistake = false;
                    break;
                case "6":
                    System.out.println("June");
                    mistake = false;
                    break;
                case "7":
                    System.out.println("July");
                    mistake = false;
                    break;
                case "8":
                    System.out.println("August");
                    mistake = false;
                    break;
                case "9":
                    System.out.println("September");
                    mistake = false;
                    break;
                case "10":
                    System.out.println("October");
                    mistake = false;
                    break;
                case "11":
                    System.out.println("November");
                    mistake = false;
                    break;
                case "12":
                    System.out.println("December");
                    mistake = false;
                    break;
                default:
                    System.out.println("try again");
                    mistake = true;
                    break;
            }
        } while (mistake);
    }
}
