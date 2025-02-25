package com.rbuddhar.practise_ques.Basics;

import java.util.Scanner;

public class BiggestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();
        System.out.print("Biggest of "+num1+","+num2+","+num3+" is : "+findBiggestOfThreeNumbers(num1,num2,num3));

    }
    public static int findBiggestOfThreeNumbers(int a, int b, int c) {
        return a > b ? a : b > c ? b : Math.max(c, a);
    }
}
