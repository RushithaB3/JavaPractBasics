package com.rbuddhar.practise_ques.basics;

import java.util.Scanner;

public class DigitsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();


        System.out.println("The sum of digits is " + sumOfDigits(number));
        System.out.println("Number of digits in number is " + numberOfDigits(number));
        System.out.println("reverse of "+number+" is "+ reverseNumber(number));
        palindrome(number);

        System.out.println("sum till single digit of "+number+" is "+ singleDigitSum(number));


    }

    public static int sumOfDigits(int number) {
        int d;
        int sum = 0;
        while (number > 0) {
            d = number % 10;
            number /= 10;
            sum += d;
        }
        return sum;
    }
    public static int numberOfDigits(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }return count;
    }
    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }return reversed;
    }

    public static void palindrome(int number) {
        if( reverseNumber(number)==number){
            System.out.println(number+" is a palindrome");
        } else{
            System.out.println(number+" is not a palindrome");
        }
    }

    public static int singleDigitSum(int n) {
        int sum = 0;
        n = sumOfDigits(n);
        if(numberOfDigits(n)!=1){
            sum = sumOfDigits(n);
        }
        return sum;
    }
}
