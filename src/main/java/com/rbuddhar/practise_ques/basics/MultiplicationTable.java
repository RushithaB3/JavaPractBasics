package com.rbuddhar.practise_ques.basics;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter which table: ");
        int table = input.nextInt();
        table(table);

    }
    public static void table(int a) {
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d * %2d = %2d\n", a, i, a * i);

        }
    }
}
