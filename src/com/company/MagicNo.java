package com.company;

import java.util.Arrays;

public class MagicNo {

    public static void main(String[] args) {
        int[] array={4,3,8,7,5,2,6};
        int missingNumber = findMissingNum(array);
        System.out.println("The missing Number is "+ missingNumber);

    }

    public static int findMissingNum(int[] array) {
        int n = array.length + 1;
        int sumOfNNumbers = n*(n+1)/2;
        int sumOfAvailableNos = Arrays.stream(array).sum();
        return sumOfNNumbers - sumOfAvailableNos;
    }
}
