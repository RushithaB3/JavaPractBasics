package com.rbuddhar.practise_ques.basics;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to fibonacci series : ");
        int n = scanner.nextInt();
        System.out.println("The fibonacci series is : ");
        fibonacciWhile(n);
    }
    //Recursion
    public static void fibonacciWhile(int n) {
        int a=0; int b=1; int c; int count = 2;
        System.out.print(a+" "+b);
        while (count < n ) {
            c = a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            count++;

        }
    }
    public static void fibonacciFor(int n) {
        int a=0; int b=1;
        System.out.print(a+" "+b);
        for (int i = 1; i < n-1; i++) {
            int c = a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
