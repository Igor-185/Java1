package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static double volumeBallDouble(double radius) {
        final double PI = 3.14;
        radius = 6371.2;
        double volumeBallDouble = 4d / 3d * PI * radius * radius * radius;

        return volumeBallDouble;
    }

    public static float volumeBallFloat(float radius) {
        final float PI = 3.14f;
        radius = 6371.2f;
        float volumeBallFloat = 4f / 3f * PI * radius * radius * radius;

        return volumeBallFloat;
    }

    public static double calculateAccuracy(double radius) {
        radius = 6371.2;
        float radius1 = (float) radius;
        double calculateAccuracy = volumeBallDouble(radius) - volumeBallFloat(radius1);

        return calculateAccuracy;
    }
}
