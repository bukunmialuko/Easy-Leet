package com.company;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        // write your code here
        // 5 x 4 x 3 x 2 x 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer value only  ");
        int userInput = sc.nextInt();
        System.out.println("The factorial of " + userInput + " is " + calculateFactorial(userInput));

    }

    private static int calculateFactorial(int userInput) {
        int result = 1;
        for (int i = 1; i <= userInput; i++) {
            result = result*i;
        }
        return result;
    }
}
