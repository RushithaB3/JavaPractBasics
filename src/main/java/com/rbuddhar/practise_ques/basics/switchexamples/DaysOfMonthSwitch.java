package com.rbuddhar.practise_ques.basics.switchexamples;

public class DaysOfMonthSwitch {
    public static void main(String[] args) {
        System.out.println(numberOfDays(2  , 2024));
        System.out.println(numberOfDays(2, 2025));

    }
    public static int numberOfDays(int month,int year) {
        return  switch (month) {
            case 1,3,5,7,8,10,12 -> 31;
            case 4,6,9,11 -> 30;
            case 2-> isLeapYear(year) ? 29 : 28;
            default -> { throw new IllegalArgumentException("Invalid month"); }
        };
    }
    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
