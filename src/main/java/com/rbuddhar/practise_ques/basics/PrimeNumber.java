package com.rbuddhar.practise_ques.basics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if(isPrime(num)) {
            System.out.println(num + " is a prime number");
        }else{
            System.out.println(num + " is not a prime number");
        }

        System.out.print("prime numbers upto "+num+": ");
        uptoNisPrime(num);

        System.out.println("\nNo of prime numbers upto "+num+": "+isPrimeCount(num));
    }
    public static boolean isPrime(int num) {
        if(num > 1){
            for(int i = 2; i <= num/2; i++){
                if(num % i == 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void uptoNisPrime(long num) {
        int i;
        for( i = 2; i <= num; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static int isPrimeCount(long num) {
        int count = 0;
        for(int i = 2; i <= num; i++){
            if(isPrime(i)){
                count++;
            }
        }return count;
    }
}
