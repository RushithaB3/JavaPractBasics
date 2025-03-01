package com.rbuddhar.practise_ques.basics.switchexamples;

public class UtilsNumberOperations {
    //Instance Method for reverse of number
    public int reverseNumber(int number) {
        int reversed = 0;
        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }return reversed;
    }
    //Instance Method for Palindrome
    public boolean palindrome(int number) {
        if( reverseNumber(number)==number){
            return true ;
        } return false;
    }

    //Instance Method for Sum of Digits
    public int sumOfDigits(int number) {
        int d;
        int sum = 0;
        while (number > 0) {
            d = number % 10;
            number /= 10;
            sum += d;
        }
        return sum;
    }
    //Instance Method for number of Digits
    public int numberOfDigits(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
    //Instance Method for GCD of n Numbers

    public static int gcd( int a, int b) {
        int temp = 0;
        while(a % b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        return b;
    }
    public int findGCDOfArray(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = gcd(result, numbers[i]);
        }return result;
    }

    //Instance Method for Armstrong Number
    public boolean checkArmstrongNumber(int n) {
        int d,a;
        int temp = n;
        int sum = 0;
        while (n > 0) {
            d = n % 10;
            a = (int)Math.pow(d, numberOfDigits(temp));
            n /= 10;
            sum += a;
        } return sum == temp;
    }
    //Instance Method for Factorial of number
    public long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }return fact;
       // return Factorial.factorial(num);

    }
    //Instance method for biggest of N numbers
    public int biggest(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }
    //Instance method for single digit prime
    public boolean sPrime(long n) {
        // We know the prime digits are 2, 3, 5, and 7
        return n == 2 || n == 3 || n == 5 || n == 7;
    }

    //Instance Method for Count of prime digits in a Number
    public int digitPrimeCount(long n) {
        int count = 0;
        while (n > 0) {
            long digit = n % 10;
            if (sPrime(digit)) {
                count++;
            }
            n /= 10;
        }
        return count;
    }

    //Instance Method for Sum of Digits of number until Single Digit
    public int singleDigitSum(int n) {
        int sum = 0;
        n = sumOfDigits(n);
        if(numberOfDigits(n)!=1){
            sum = sumOfDigits(n);
        }
        return sum;
    }
}
