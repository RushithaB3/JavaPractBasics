package com.rbuddhar.PractiseQues.Numbers;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        IsEven(number);

    }
    public static void IsEven(int number) {
        if (number < 0) {
            if (number % 2 == 0) {
                System.out.println(number + " is even negative");
            } else {
                System.out.println(number + " is odd Negative");
            }
        } else if (number >= 0 && number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }
}
