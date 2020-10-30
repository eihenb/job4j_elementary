package ru.job4j.condition;

public class Game {
    public static void menu(String name) {
        if (name.equals("super mario")) {
            System.out.println("Start - super Mario");
        } else if (name.equals("tetris")) {
            System.out.println("Start - tetris");
        } else if (name.equals("tanks")) {
            System.out.println("start - tanks");
        }
    }

    public static void main(String[] args) {
        menu("tanks");
    }
}
