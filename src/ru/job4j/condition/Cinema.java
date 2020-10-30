package ru.job4j.condition;

public class Cinema {
    public static void main(String[] args) {
        Cinema.access(15);
        Cinema.access(20);
        Cinema.access(65);
    }

    public static void access(int age) {
        System.out.println("The custom age is " + age);

        if (age >= 18) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Sorry next time");
        }
    }
}
