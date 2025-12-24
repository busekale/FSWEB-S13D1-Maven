package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    // 1) Havlayan Köpek
    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) return false;
        if (!isBarking) return false;

        return clock >= 20 || clock < 8;
    }

    // 2) Yaş Tespiti
    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return isTeen(firstAge) || isTeen(secondAge) || isTeen(thirdAge);
    }

    private static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }

    // 3) Oyuncu Kedi
    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int upperLimit = isSummer ? 45 : 35;
        return temp >= 25 && temp <= upperLimit;
    }

    // 4) Alan Hesaplama - Dikdörtgen
    public static double area(double width, double height) {
        if (width < 0 || height < 0) return -1;
        return width * height;
    }

    // 4) Alan Hesaplama - Daire
    public static double area(double radius) {
        if (radius < 0) return -1;
        return radius * radius * Math.PI;
    }
}
