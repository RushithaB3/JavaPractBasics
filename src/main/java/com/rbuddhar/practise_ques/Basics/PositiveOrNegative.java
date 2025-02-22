package com.rbuddhar.practise_ques.Basics;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        PositiveOrNot(number);
    }
    public static void PositiveOrNot(int number) {
        if (number < 0) {
            System.out.println(number+ " is Negative number");
        }else if (number == 0) {
            System.out.println(number+ " is Neither positive number nor Negative number");
        }else{
            System.out.println(number+ " is Positive number");
        }
    }
}
