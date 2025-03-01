package com.rbuddhar.practise_ques.basics;

import java.util.Scanner;

public class StarPatterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = input.nextInt();
        System.out.println("pyramid");
        pyramid(rows);
        System.out.println("Inverted pyramid");
        invertedPyramid(rows);
        System.out.println("Left pyramid");
        leftTriangle(rows);
        System.out.println("Left Inverted pyramid");
        invertedLeftTriangle(rows);
        System.out.println("Right pyramid");
        rightTriangle(rows);
        System.out.println("Right Inverted pyramid");
        invertedRightTriangle(rows);
        System.out.println("square");
        square(rows);
        System.out.println("Rhombus");
        quadrilateral(rows);
        System.out.println("Diamond");
        diamond(rows);


    }
    public static void pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <=n- 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }System.out.println();
        }
    }
    public static void invertedPyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = n-1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }System.out.println();
        }
    }
    public static void leftTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }System.out.println();
        }
    }
    public static void invertedLeftTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }System.out.println();
        }
    }

    public static void rightTriangle(int n) {
        int i,j;
        for (i = 1 ; i <= n; i++) {
            for(j=i; j<= n-1 ; j++) {
                System.out.print("  ");
            }
            for(j = 1; j <= i ; j++) {
                System.out.print("* ");
            }System.out.println();
        }
    }

    public static void invertedRightTriangle(int n) {
        int i,j;
        for (i = n ; i >= 1; i--) {
            for(j=n-1; j>= i ; j--) {
                System.out.print("  ");
            }
            for(j = 1; j <= i ; j++) {
                System.out.print("* ");
            }System.out.println();
        }
    }

    public static void square(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }System.out.println();
        }
    }

    public static void quadrilateral(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }System.out.println();
        }
    }
    public static void diamond(int n){
        pyramid(n);
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("* ");
            }System.out.println();
        }

    }
}
