package com.rbuddhar.practise_ques.numbers;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to fibonacci series : ");
        int n = scanner.nextInt();
        System.out.println("The fibonacci series is : ");
        Fibonacci(n);
    }
    public static void Fibonacci(int n) {
        int a=0; int b=1; int c=0; int count = 2;
        System.out.print(a+" "+b);
        while (count < n ) {
            c = a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            count++;

        }

    }
}
