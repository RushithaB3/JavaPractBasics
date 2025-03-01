package com.rbuddhar.assignment;

import java.util.Scanner;

public class ProfitOrLoss {public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the Cost price : ");
    double costPrice = input.nextDouble();
    System.out.print("Enter the Selling price : ");
    double sellingPrice = input.nextDouble();

    double profitLoss = sellingPrice- costPrice;
    if(costPrice >= 0 && sellingPrice >= 0) {
        if(costPrice == 0 && sellingPrice == 0) {
            System.out.println("You have no profit or loss.");
        }
        else if(profitLoss > 0) {
            System.out.println("Your Cost price is $" + costPrice+ "\nYour Selling price is $" + sellingPrice+"\nYour Profit is $" + profitLoss);
        }else {
            System.out.println("Your Cost price is $" + costPrice+ "\nYour Selling price is $" + sellingPrice+"\nYour Loss is $" + (-(profitLoss)));
        }
    }else{
        System.out.println("Please enter a valid values!");
    }

}
}
