package com.rbuddhar.practise_ques.basics;

import java.util.Scanner;

public class PrintNNumbersForWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = input.nextInt();
        printNNumbers_for(number);
        System.out.println();
        printNNumbers_while(number);
    }
    public static void printNNumbers_while(int n) {
        int count = 0;
        while (count <= n) {
            System.out.print(count + " ");
            count++;
        }
    }
    public static void printNNumbers_for(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
