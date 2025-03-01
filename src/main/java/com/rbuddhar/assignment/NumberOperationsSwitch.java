package com.rbuddhar.assignment;
import com.rbuddhar.practise_ques.basics.switchexamples.UtilsNumberOperations;

import java.util.Scanner;
public class NumberOperationsSwitch {
    public static void main(String[] args) {
        UtilsNumberOperations utils = new UtilsNumberOperations(); // created an object
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Reverse of a Number\n" +
                "2. Palindrome\n"+"3. Sum of Digits of Given Number\n"+
                "4. Number of Digits of Given Number\n" + "5. Gcd of Given Numbers\n"+
                "6. Armstrong Number\n"+"7. Factorial of number\n"+"8. biggest of Given Numbers\n"+
                "9. prime digits in given number\n"+"10. Sum of digits until single Digit\n"
                +"Enter your choice: ");
        int choice = scanner.nextInt();
        switch(choice) {
            case 1 ->{
                System.out.println("Enter a Number");
                int number = scanner.nextInt();
                int reverse = utils.reverseNumber(number);
                System.out.println("Reverse of a number "+number+" is: "+reverse);
            }
            case 2 ->{
                System.out.println("Enter a Number");
                int number = scanner.nextInt();
                boolean palindrome = utils.palindrome(number);
                if (palindrome) {System.out.println("Number "+number+" is: palindrome");}
                else{
                    System.out.println("Number "+number+" is: not palindrome");
                }
            }
            case 3 ->{
                System.out.println("Enter a Number");
                int number = scanner.nextInt();
                int sum = utils.sumOfDigits(number);
                System.out.println("Sum of digits of given number "+number+" is: "+sum);
            }
            case 4 ->{
                System.out.println("Enter a Number");
                int number = scanner.nextInt();
                int num = utils.numberOfDigits(number);
                System.out.println("Number of digits of given number "+number+" is: "+num);
            }
            case 5 ->{
                System.out.println("Enter how many numbers you want to check: ");
                int n = scanner.nextInt();
                System.out.println("Enter Numbers: ");
                int[] numbers = new int[n];
                for (int i = 0; i < n; i++) {
                    numbers[i] = scanner.nextInt();
                }
                int gcd = utils.findGCDOfArray(numbers);
                System.out.println("GCD of given numbers is " + gcd);
            }
            case 6 ->{
                System.out.println("Enter a Number: ");
                int number = scanner.nextInt();
                boolean num = utils.checkArmstrongNumber(number);
                if(num){
                    System.out.println(number+": is Armstrong number");
                }else{
                    System.out.println(number+": is Not Armstrong number");
                }
            }
            case 7 ->{
                System.out.println("Enter a Number: ");
                int number = scanner.nextInt();
                long fact = utils.factorial(number);
                System.out.println("Factorial of "+number+" is: "+fact);
            }
            case 8 ->{
                System.out.println("Enter how many numbers you want to check: ");
                int n = scanner.nextInt();
                System.out.println("Enter Numbers: ");
                int[] numbers = new int[n];
                for (int i = 0; i < n; i++) {
                    numbers[i] = scanner.nextInt();
                }
                int biggest = utils.biggest(numbers);
                System.out.println("biggest of given numbers is: "+biggest);
            }
            case 9 ->{
                System.out.println("Enter a Number: ");
                int number = scanner.nextInt();
                int dc_prime = utils.digitPrimeCount(number);
                System.out.println("prime digits in given number is: "+dc_prime);
            }
            case 10 ->{
                System.out.println("Enter a Number: ");
                int number = scanner.nextInt();
                int S_sum = utils.singleDigitSum(number);
                System.out.println("Sum of digits of "+number+" is: "+S_sum);
            }
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        }
    }

}
