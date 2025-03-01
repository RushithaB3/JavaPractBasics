package com.rbuddhar.practise_ques.basics;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to fibonacci series : ");
        int n = scanner.nextInt();
        System.out.println("The fibonacci series is : ");
        fibonacci(n);
    }
    public static void fibonacci(int n) {
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
