package com.rbuddhar.practise_ques.basics;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("The sum of first " + num + " numbers is: " + sum);

        int diff = 0;
        for (int i = num ; i >= 1; i--) {
            diff -= i;
        }
        System.out.println("The difference of first " + num + " numbers is: " + diff);
    }
}
