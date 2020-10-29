package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanHeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short manHeight = 187;
        double man = Fit.manWeight(manHeight);
        System.out.println("Man 187 is " + man);

        short womanHeight = 175;
        double woman = Fit.womanHeight(womanHeight);
        System.out.println("Woman 175 is " + woman);
    }
}
