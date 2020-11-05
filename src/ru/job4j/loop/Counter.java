package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int summ = 0;
        for(int i = start; i <= finish; i++) {
            summ = summ + i;
        }
        return summ;
    }


    public static void main(String[] args) {
        System.out.println(sum(1,5));
        System.out.println(sum(5,10));
        System.out.println(sum(100,500));
    }
}
