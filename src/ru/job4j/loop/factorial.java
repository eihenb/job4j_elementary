package ru.job4j.loop;

public class factorial {
    public static int calc(int n) {
        long result = 1;

        for (int factor = 2; factor <= n; factor++) {
            result *= factor;
        }
        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println(calc(5));
    }
}
