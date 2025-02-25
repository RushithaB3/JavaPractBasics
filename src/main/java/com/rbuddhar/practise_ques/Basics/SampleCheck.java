package com.rbuddhar.practise_ques.Basics;

import java.util.Scanner;
public class SampleCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long number = input.nextLong();
        System.out.println("The number of prime digits is "+DigitPrimeCount(number));

    }
    //Instance method for Prime
    public static boolean Prime(long n) {
        // We know the prime digits are 2, 3, 5, and 7
        return n == 2 || n == 3 || n == 5 || n == 7;
    }
        //Instance Method for Count of prime digits in a Number
        public static int DigitPrimeCount(long n) {
            int count = 0;
            while (n > 0) {
                long digit = n % 10;
                if (Prime(digit)) {
                    count++;
                }
                n /= 10;
            }
            return count;
        }

}