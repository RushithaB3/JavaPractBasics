package com.rbuddhar.practise_ques.Basics;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

         if(CheckArmstrongNumber(number)){
             System.out.println(number + " is an Armstrong number");
         }else{
             System.out.println(number + " is not an Armstrong number");
         }

         System.out.print("Armstrong numbers upto "+number+": ");
         ArmstrongNumberUptoN(number);
    }
    public static int NumberOfDigits(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static boolean CheckArmstrongNumber(int n) {
        int d,a;
        int temp = n;
        int sum = 0;
        while (n > 0) {
            d = n % 10;
            a = (int)Math.pow(d,NumberOfDigits(temp));
            n /= 10;
            sum += a;
        } return sum == temp;
    }

    public static void ArmstrongNumberUptoN(int n) {
        for (int i = 1; i <= n; i++) {
            if(CheckArmstrongNumber(i)){
                System.out.print(i+" ");
            }
        }
    }

}
