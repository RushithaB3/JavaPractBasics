package com.rbuddhar.practise_ques.Basics.Switch;

public class UtilsNumberOperations {
    //Instance Method for reverse of number
    public int ReverseNumber(int number) {
        int reversed = 0;
        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }return reversed;
    }
    //Instance Method for Palindrome
    public boolean palindrome(int number) {
        if( ReverseNumber(number)==number){
            return true ;
        } return false;
    }

    //Instance Method for Sum of Digits
    public int SumOfDigits(int number) {
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
    public int NumberOfDigits(int n) {
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
    public boolean CheckArmstrongNumber(int n) {
        int d,a;
        int temp = n;
        int sum = 0;
        while (n > 0) {
            d = n % 10;
            a = (int)Math.pow(d,NumberOfDigits(temp));
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
    //Instance method for Biggest of N numbers
    public int Biggest(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }
    //Instance method for single digit Prime
    public boolean SPrime(long n) {
        // We know the prime digits are 2, 3, 5, and 7
        return n == 2 || n == 3 || n == 5 || n == 7;
    }

    //Instance Method for Count of prime digits in a Number
    public int DigitPrimeCount(long n) {
        int count = 0;
        while (n > 0) {
            long digit = n % 10;
            if (SPrime(digit)) {
                count++;
            }
            n /= 10;
        }
        return count;
    }

    //Instance Method for Sum of Digits of number until Single Digit
    public int SingleDigitSum(int n) {
        int sum = 0;
        n = SumOfDigits(n);
        if(NumberOfDigits(n)!=1){
            sum = SumOfDigits(n);
        }
        return sum;
    }
}
