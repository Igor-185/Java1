package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit) {
        int i = 0;
        boolean result = false;
        if (number == 0 && digit == 0)
            result = true;
        else while (number > 0) {
            if (digit == number % 10)
                result = true;
            i++;
            number = number / 10;
        }
        return result;
    }

    public static int fiboNumber(int n) {
        int n0 = 1;
        int n1 = 1;
        for (int i = 3; i <= n; i++) {
            int n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
        }
        return n1;
    }

    public static boolean isGoldenTriangle(int a, int b, int c) {
        boolean result = false;
        Double doub1 = (double) a;
        Double doub2 = (double) b;
        Double doub3 = (double) c;
        double const1 = 1.61703;
        double const2 = 1.61903;
        if (a == b) {
            if (doub1 / doub3 > const1 && doub1 / doub3 < const2)
                result = true;
        } else if (a == c) {
            if (doub1 / doub2 > const1 && doub1 / doub2 < const2)
                result = true;
        } else if (b == c) {
            if (doub2 / doub1 > const1 && doub2 / doub1 < const2)
                result = true;
        }
        return result;
    }

    public static void main(String[] args) {

        int n = 1;
        while (n <= 15) {
            System.out.println(fiboNumber(n));
            n++;
        }

        for (int b = 1; b <= 100; b++)
            for (int a = 1; a <= 100; a++)
                if (isGoldenTriangle(b, b, a))
                    System.out.println("длина основания - " + a + "; рёбер - " + b);
    }
}
