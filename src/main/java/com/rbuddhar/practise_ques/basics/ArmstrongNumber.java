package com.rbuddhar.practise_ques.basics;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

         if(checkArmstrongNumber(number)){
             System.out.println(number + " is an Armstrong number");
         }else{
             System.out.println(number + " is not an Armstrong number");
         }

         System.out.print("Armstrong numbers upto "+number+": ");
         armstrongNumberUptoN(number);
    }
    public static int numberOfDigits(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static boolean checkArmstrongNumber(int n) {
        int d,a;
        int temp = n;
        int sum = 0;
        while (n > 0) {
            d = n % 10;
            a = (int)Math.pow(d,numberOfDigits(temp));
            n /= 10;
            sum += a;
        } return sum == temp;
    }

    public static void armstrongNumberUptoN(int n) {
        for (int i = 1; i <= n; i++) {
            if(checkArmstrongNumber(i)){
                System.out.print(i+" ");
            }
        }
    }

}
