package com.rbuddhar.practise_ques.numbers;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        int principal = scanner.nextInt();
        System.out.print("Enter rate of interest in %: ");
        int rate = scanner.nextInt();
        System.out.print("Enter number of years: ");
        int time = scanner.nextInt();
        System.out.print("Your Interest is: "+CalculateSI(principal, rate, time ));
    }
    public static int CalculateSI(int p, int r,int t) {
        int si = (p * r * t) / 100;
        return si;
    }
}
