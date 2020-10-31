package ru.job4j.condition;

public class MultiMax {
    public static int max(int num1, int num2, int num3) {
        int res = num3 > (num1 > num2 ? num1 : num2) ? num3 : ((num1 > num2) ? num1 : num2);
        return res;
    }

    public static void main(String[] args) {
        int res = max(1,2,5);
        System.out.println(res);
    }
}
