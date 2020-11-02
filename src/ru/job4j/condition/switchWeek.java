package ru.job4j.condition;

public class switchWeek {

    public static String nameOfDay(int n) {
        String weekDay = "";

        switch(n) {
            case 1:
                weekDay = "Понедельник";
                break;
            case 2:
                weekDay = "Вторник";
                break;
            case 3:
                weekDay = "Среда";
                break;
            case 4:
                weekDay = "Четверг";
                break;
            case 5:
                weekDay = "Пятница";
                break;
            case 6:
                weekDay = "Суббота";
                break;
            case 7:
                weekDay = "Воскресение";
                break;
            default: weekDay = "Нету такого дня";
                break;
        }
        return weekDay;
    }

    public static void main(String[] args) {
        String rsl = switchWeek.nameOfDay(3);
        System.out.println(rsl);
    }
}
