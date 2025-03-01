package com.rbuddhar.assignment;

import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {

        double baseAmount = 100;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of units: ");
        int units = input.nextInt();
        if(units >= 0) {
            if (units <= 100) {
                //unit charge 1.5
                System.out.println("Your units used: " + units+ "\nCharge per unit: 1.5"+"\nBase amount: 100"+"\nTotal amount: " + (baseAmount +(units*1.5)));
            } else if (units > 100 && units <= 200) {
                // units charge  2
                System.out.println("Your units used: " + units+ "\nCharge per unit: 2.0"+"\nBase amount: 100"+"\nTotal amount: " + (baseAmount +(units*2.0)));
            } else if (units > 200 && units <= 300) {
                // unit charge 3
                System.out.println("Your units used: " + units+ "\nCharge per unit: 3.0"+"\nBase amount: 100"+"\nTotal amount: " + (baseAmount +(units*3.0)));
            } else {
                // 5
                System.out.println("Your units used: " + units+ "\nCharge per unit: 5.0"+"\nBase amount: 100"+"\nTotal amount: " + (baseAmount +(units*5.0)));
            }
        }else {
            System.out.println("Invalid units. Try again!");
        }
    }
}
