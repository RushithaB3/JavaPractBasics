package com.rbuddhar.PractiseQues.Numbers;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter which table: ");
        int table = input.nextInt();
        Table(table);

    }
    public static void Table(int a) {
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d * %2d = %2d\n", a, i, a * i);

        }
    }
}
