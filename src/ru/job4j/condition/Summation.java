package ru.job4j.condition;

public class Summation {
    public static int max(int first, int second) {
        boolean condition = first > second;
        int result = condition ? first : second;
        return result;
    }


    public static void main(String[] args) {
        int rsl = Summation.max(10,20);
        System.out.println(rsl);
    }
}
