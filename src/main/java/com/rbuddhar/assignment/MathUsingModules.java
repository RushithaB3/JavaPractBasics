package com.rbuddhar.assignment;

import java.util.Scanner;

public class MathUsingModules {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        if(checkPrime(number)) {
            System.out.println("Prime number");
        }else{
            System.out.println("Not prime number");
        }

    }

    public static boolean checkPrime(int number) {
        if(number < 2|| (number % 2) == 0 && number!=2) {
            return false;
        }  for(int i = 2; i < number/2; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int primeCount(int lb, int ub) {
        int count = 0;
        for(int i=lb; i<=ub; i++) {
            if(checkPrime(i)) {
                count++;
            }
        }
        return count;
    }
    public static int[] getPrime(int lb, int ub) {
        int[] arr=new int[0];
        int PrimeCount = primeCount(lb, ub);
        if(PrimeCount != 0) {
            int index = 0;
            arr = new int[PrimeCount];
            for(int i=lb; i<=ub; i++) {
                if(checkPrime(i)) {
                    arr[index++] = i;
                }
            }
        }return arr;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int sum(int a, int b) {
        return a+b;
    }
    public static int factorial(int number) {
        if(number == 1 || number ==0) {
            return 1;
        }
        int fact =1;
        for(int i=2; i<=number; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int sumOfFirstN_NaturalNumbers(int number) {
        int sum =1;
        for(int i=0; i<=number; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumOfFirstN_EvenNumbers(int number) {
        int sum =1;
        for(int i=0; i<=number; i++) {
            if(number%2==0) {
                sum += i;
            }
        }
        return sum;
    }
    public static int sumOfFirstN_OddNumbers(int number) {
        int sum = 1;
        for (int i = 1; i <= number; i++) {
            if (number % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }
}
