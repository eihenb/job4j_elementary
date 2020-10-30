package ru.job4j.converter;

public class Converter {

        public static int rubleToEuro(int value) {
            int rsl = value / 70;
            return rsl;
        }

        public static int rubleToDollar(int value) {
            int rsl = value / 60; /* формула перевода рублей в доллары. */
            return rsl;
        }

        public static void main(String[] args) {
            int euro = Converter.rubleToEuro(140);
            System.out.println("140 rubles are " + euro + " euro.");

            int dollar = Converter.rubleToDollar(120);
            System.out.println("140 rubles are " + dollar + " dollars.");


//            int in = 140;
//            int expected = 2;
//            int out = Converter.rubleToEuro(in);
//            boolean passed = out == expected;
//            System.out.println("test for convert ruble to Euro : " + passed);
//
            int in1 = 120;
            int expected1 = 2;
            int out1 = Converter.rubleToEuro(in1);
            boolean passed1 = out1 == expected1;
            System.out.println("test for convert ruble to Dollar : " + passed1);

        }
    }
