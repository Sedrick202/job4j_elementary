package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rslONE = (x2 - x1);
        double rslTWO = (y2 - y1);
        double rslThree = Math.pow(rslONE, 2);
        double rslFour = Math.pow(rslTWO, 2);
        double rslFive = rslThree + rslFour;
        double rslSix = Math.sqrt(rslFive);
        return rslSix;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double resultOne = Point.distance(1, 3, 6, 2);
        System.out.println(result);
        System.out.println(resultOne);
    }
}
