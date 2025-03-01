package com.rbuddhar.assignment;

import java.util.Scanner;

public class MonthEnum {
    enum Month {
        JANUARY, February, March, April, May, June, July, August, September, October, November, December;
    }
    public static void main(String[] args) {
        System.out.print("Enter the month number to see the month name: ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        switch (month) {
            case 1 -> System.out.println(Month.JANUARY);
            case 2 -> System.out.println(Month.February);
            case 3 -> System.out.println(Month.March);
            case 4 -> System.out.println(Month.April);
            case 5 -> System.out.println(Month.May);
            case 6 -> System.out.println(Month.June);
            case 7 -> System.out.println(Month.July);
            case 8 -> System.out.println(Month.August);
            case 9 -> System.out.println(Month.September);
            case 10 -> System.out.println(Month.October);
            case 11 -> System.out.println(Month.November);
            case 12 -> System.out.println(Month.December);
            default -> System.out.println("Invalid month Number");

        }



    }
}
