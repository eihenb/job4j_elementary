package ru.job4j.condition;

public class Point {
        public static double distance(int x1, int y1, int x2, int y2) {
            double x = x2 - x1;
            double y = y2 - y1;

            double first = Math.pow(y, 2);
            double second = Math.pow(x, 2);

            double res = first + second;
            double sqrt1 = Math.sqrt(res);

            return sqrt1;
        }

        public static void main(String[] args) {
            double result = Point.distance(0, 0, 2, 0);
            System.out.println("result (0, 0) to (2, 0) " + result);

            double result1 = Point.distance(1, 2, 0, 5);
            System.out.println("result (0, 0) to (2, 0) " + result);
        }
}
