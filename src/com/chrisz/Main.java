package com.chrisz;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-2772));
    }

    public static boolean isPalindrome(int number) {
        number = number;
        int reverse = reverseMethod(number);

        return reverse == number;
    }

    public static int reverseMethod(int number) {
        int reverse = 0;
        while(number != 0) {
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
            System.out.println(reverse);
            System.out.println(number);
        }
        return reverse;
    }
}

