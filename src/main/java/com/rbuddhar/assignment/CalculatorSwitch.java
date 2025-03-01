package com.rbuddhar.assignment;

import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which operation you want to perform?\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        int operation = scanner.nextInt();
        switch (operation) {
            case 1->{
                System.out.println("Enter first number");
                int firstNumber = scanner.nextInt();
                System.out.println("Enter second number");
                int secondNumber = scanner.nextInt();
                int result = firstNumber + secondNumber;
                System.out.println("The result is: " + result);
            }
            case 2->{
                System.out.println("Enter first number");
                int firstNumber = scanner.nextInt();
                System.out.println("Enter second number");
                int secondNumber = scanner.nextInt();
                int result = firstNumber - secondNumber;
                System.out.println("The result is: " + result);
            }
            case 3->{
                System.out.println("Enter first number");
                int firstNumber = scanner.nextInt();
                System.out.println("Enter second number");
                int secondNumber = scanner.nextInt();
                int result = firstNumber * secondNumber;
                System.out.println("The result is: " + result);
            }
            case 4->{
                System.out.println("Enter first number");
                int firstNumber = scanner.nextInt();
                System.out.println("Enter second number");
                int secondNumber = scanner.nextInt();
                int result = firstNumber / secondNumber;
                System.out.println("The result is: " + result);
            }
            default -> System.out.println("Invalid operation!");
        }
    }
}
