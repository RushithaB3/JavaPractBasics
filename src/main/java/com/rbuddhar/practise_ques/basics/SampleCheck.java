package com.rbuddhar.practise_ques.basics;

import java.util.Scanner;
public class SampleCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long number = input.nextLong();
        System.out.println("The number of prime digits is "+ digitPrimeCount(number));

    }
    //Instance method for prime
    public static boolean prime(long n) {
        // We know the prime digits are 2, 3, 5, and 7
        return n == 2 || n == 3 || n == 5 || n == 7;
    }
        //Instance Method for Count of prime digits in a Number
        public static int digitPrimeCount(long n) {
            int count = 0;
            while (n > 0) {
                long digit = n % 10;
                if (prime(digit)) {
                    count++;
                }
                n /= 10;
            }
            return count;
        }

}