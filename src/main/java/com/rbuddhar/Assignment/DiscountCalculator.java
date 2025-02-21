package com.rbuddhar.Assignment;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount: ");
        double billAmount = sc.nextDouble();
        double discount = 0;
        if(billAmount > 1){
            if(billAmount > 5000) {
                discount = billAmount * 0.2;
                System.out.println("Bill amount is : "+billAmount+"\nYou got Discount of : "+discount+"\nNet amount is : "+(billAmount - discount));
            } else {
                System.out.println("Bill amount is : "+billAmount+"\nDiscount is : 0");
            }
        }else {
            System.out.println("Bill amount is invalid. Please check again!");
        }
    }

}
