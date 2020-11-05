package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int summ = 0;
        for(int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                summ = summ + i;
            }
        }
        return summ;
    }


    public static void main(String[] args) {
        System.out.println(sum(1,30));
    }
}
