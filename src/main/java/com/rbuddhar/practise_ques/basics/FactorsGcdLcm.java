package com.rbuddhar.practise_ques.basics;

import java.util.Scanner;

public class FactorsGcdLcm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = scanner.nextInt();
        System.out.println("Enter another integer: ");
        int m = scanner.nextInt();

        System.out.println("Factors of " + n + "are: ");
        factor(n);
        System.out.println("Factors of " + m + "are: ");
        factor(m);

        System.out.println("GCD of " + n +" "+m+ " is: "+gcd(n,m));
        System.out.println("LCM of " + n +" "+m+ " is: "+lcm(n,m));

    }
    public static void factor(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i+" ");
            }
        }System.out.println();
    }

    public static int gcd( int a, int b) {
        int temp = 0;
        while(a % b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static int lcm( int a, int b) {
        int lcm = a * b / gcd(a,b);
        return lcm;
    }
}
