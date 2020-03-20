package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c) {
        boolean result = false;
        if ((a < b + c) && (b < a + c) && (c < a + b))
            result = true;
        System.out.println(result);
        return result;
    }

    public static boolean isRightTriangle(int a, int b, int c) {
        boolean result = false;
        if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a))
            result = true;
        System.out.println(result);
        return result;
    }

    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        boolean result = false;
        if (a == b || a == c || b == c)
            result = true;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        isTriangle(3, 4, 6);
        isRightTriangle(3, 4, 5);
        isIsoscelesTriangle(3, 3, 4);
        isIsoscelesTriangle(3, 5, 4);
    }
}
