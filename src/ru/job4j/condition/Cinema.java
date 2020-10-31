package ru.job4j.condition;

public class Cinema {
    public static void permission(boolean allowByParents, boolean hasMoney) {
        if (allowByParents && hasMoney) {
            System.out.println("I can go to Cinema.");
        } else {
            System.out.println("I can't go to Cinema.");
        }
    }

    public static void main(String[] args) {
        Cinema.permission(true, true); // true
        Cinema.permission(false, true); // false
        Cinema.permission(true, false); // false
    }
}
