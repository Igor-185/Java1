package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number) {
        int c = number % 10;
        number = number / 10;
        int b = number % 10;
        int a = number / 10;
        number = 100 * c + 10 * b + a;

        return number;
    }
}
