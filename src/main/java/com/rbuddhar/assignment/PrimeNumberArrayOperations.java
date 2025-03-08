package com.rbuddhar.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumberArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of prime numbers: ");
        int n = scanner.nextInt();
        int[] primes = new int[n];
        System.out.println(Arrays.toString(primes));
    }

    public static int[] getPrimeNumbers(int n) {
        int[] primeNumbers = new int[n];
        int count = 0;
        int number = 2;

        while (count < n) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers[count] = number;
                count++;
            }
            number++;
        }
        return primeNumbers;
    }
}
