package ru.job4j.condition;

public class MultiSwitchWeek {
    public static int numberOfDay(String name) {
        int num = 0;
        int value = switch(name) {
            case "Понедельник", "monday" -> num = 1;
            case "Вторник", "tuesday" -> num = 2;
            case "Среда", "wednesday" -> num = 3;
            case "Четверг", "Thursday" -> num = 4;
            case "Пятнца", "Friday" -> num = 5;
            case "Суббота", "Saturday" -> num = 6;
            case "Воскресение", "Sunday" -> num = 7;
            default -> -1;
        };
        return num;
    }

    public static void main(String[] args) {
        int rsl = numberOfDay("Sunday");
        System.out.println(rsl);
    }
}
