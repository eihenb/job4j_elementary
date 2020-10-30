package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {

        int height = p / (2 * (k + 1));
        int longSide = height * k;
        double s = longSide * height;
        return s;

    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 2);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
    }
}
