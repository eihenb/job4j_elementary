package ru.job4j.condition;

public class AlertByDiv {
    public static void main(String[] args) {
        possibleDiv(0);
        possibleDiv(-5);
    }

    public static void possibleDiv (int num) {
        if (num == 0) {
            System.out.println("could not div by 0");
        } else if (num < 0) {
            System.out.println("This is negative number");
        }
    }
}
