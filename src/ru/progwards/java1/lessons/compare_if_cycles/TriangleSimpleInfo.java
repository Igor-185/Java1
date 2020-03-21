package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c) {
        int i = a;
        if (b > a) {
            i = b;
            if (c > b)
                i = c;
        } else if (c > a)
            i = c;
        System.out.println("max = " + i);
        return i;
    }

    public static int minSide(int a, int b, int c) {
        int i = a;
        if (b < a) {
            i = b;
            if (c < b)
                i = c;
        } else if (c < a)
            i = c;
        System.out.println("min = " + i);
        return i;
    }

    public static boolean isEquilateralTriangle(int a, int b, int c) {
        boolean result = false;
        if (a == b && a == c)
            result = true;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        maxSide(18, 10, 11);
        minSide(12, 4, 3);
        isEquilateralTriangle(41, 4, 24);
        isEquilateralTriangle(64, 64, 64);
    }
}
