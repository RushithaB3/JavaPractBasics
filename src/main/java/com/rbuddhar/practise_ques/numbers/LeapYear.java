package com.rbuddhar.practise_ques.numbers;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        if(isLeap(year)){
            System.out.println(year+" is Leap Year");
        }else{
            System.out.println(year+" is not Leap Year");
        }

    }
    public static boolean isLeap(int year) {
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }
}
