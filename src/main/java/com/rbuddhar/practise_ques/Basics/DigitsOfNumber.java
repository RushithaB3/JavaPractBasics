package com.rbuddhar.practise_ques.Basics;

import java.util.Scanner;

public class DigitsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();


        System.out.println("The sum of digits is " + SumOfDigits(number));
        System.out.println("Number of digits in number is " + NumberOfDigits(number));
        System.out.println("reverse of "+number+" is "+ReverseNumber(number));
        palindrome(number);


    }

    public static int SumOfDigits(int number) {
        int d;
        int sum = 0;
        while (number > 0) {
            d = number % 10;
            number /= 10;
            sum += d;
        }
        return sum;
    }
    public static int NumberOfDigits(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }return count;
    }
    public static int ReverseNumber(int number) {
        int reversed = 0;
        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }return reversed;
    }

    public static void palindrome(int number) {
        if( ReverseNumber(number)==number){
            System.out.println(number+" is a palindrome");
        } else{
            System.out.println(number+" is not a palindrome");
        }
    }
}
