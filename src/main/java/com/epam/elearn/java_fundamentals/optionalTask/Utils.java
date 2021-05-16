package com.epam.elearn.java_fundamentals.optionalTask;

public class Utils {
   public String[] returnNumberSortedByLength(String data) {
       String[] numbers = data.replaceAll("\\D", " ").trim()
               .replaceAll("\\b0+(?!\\b)", "").split("\\s+");
       for (int step = 0; step < numbers.length; step++) {
           int index = minValue(numbers, step);
           String tmp = numbers[step];
           numbers[step] = numbers[index];
           numbers[index] = tmp;
       }
       return numbers;
   }
   
   public int minValue(String[] array, int startingIndex) {
       int minIndex = startingIndex;
       String minValue = array[startingIndex];
       for (int i = startingIndex + 1; i < array.length; i++) {
           if(array[i].length() < minValue.length()) {
               minValue = array[i];
               minIndex = i;
           }
       }
       return minIndex;
   }

    public int getUniqueDigitsCount(String number){
        int counterDigits = 0;
        char[] numberToCharArray = number.toCharArray();
        for (int charDigit = 48; charDigit <= 57 ; charDigit++) {
            for (int index = 0; index < numberToCharArray.length ; index++) {
                if(charDigit == numberToCharArray[index]){
                    counterDigits++;
                    break;
                }
            }
        }
        return counterDigits;
    }
}
