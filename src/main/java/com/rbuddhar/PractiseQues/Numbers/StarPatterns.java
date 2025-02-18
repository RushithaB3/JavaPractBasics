package com.rbuddhar.PractiseQues.Numbers;

import java.util.Scanner;

public class StarPatterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = input.nextInt();
        System.out.println("Pyramid");
        Pyramid(rows);
        System.out.println("Inverted Pyramid");
        InvertedPyramid(rows);
        System.out.println("Left pyramid");
        LeftTriangle(rows);
        System.out.println("Left Inverted pyramid");
        InvertedLeftTriangle(rows);
        System.out.println("Right pyramid");
        RightTriangle(rows);
        System.out.println("Right Inverted pyramid");
        InvertedRightTriangle(rows);
        System.out.println("Square");
        Square(rows);
        System.out.println("Rhombus");
        Quadrilateral(rows);
       // Diamond(rows);


    }
    public static void Pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <=n- 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }System.out.println();
        }
    }
    public static void InvertedPyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = n-1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }System.out.println();
        }
    }
    public static void LeftTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }System.out.println();
        }
    }
    public static void InvertedLeftTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }System.out.println();
        }
    }

    public static void RightTriangle(int n) {
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

    public static void InvertedRightTriangle(int n) {
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

    public static void Square(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }System.out.println();
        }
    }

    public static void Quadrilateral(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }System.out.println();
        }
    }
    public static void Diamond(int n){

    }
}
