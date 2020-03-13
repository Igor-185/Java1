package ru.progwards.java1.lessons.basics;

public class Astronomy {
    public static Double sphereSquare(double r) {
        final double PI = 3.14;
        double sphereSquare = 4 * PI * r * r;
        return sphereSquare;
    }

    public static Double earthSquare() {
        double r = 6371.2;
        double earthSquare = sphereSquare(r);

        return earthSquare;
    }

    public static Double mercurySquare() {
        double r = 2439.7;
        double mercurySquare = sphereSquare(r);

        return mercurySquare;
    }

    public static Double jupiterSquare() {
        double r = 71492;
        double jupiterSquare = sphereSquare(r);

        return jupiterSquare;
    }

    public static Double earthVsMercury() {
        double earthVsMercury = earthSquare() / mercurySquare();

        return earthVsMercury;
    }

    public static Double earthVsJupiter() {
        double earthVsJupiter = earthSquare() / jupiterSquare();

        return earthVsJupiter;
    }
}
