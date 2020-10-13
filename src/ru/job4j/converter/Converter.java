package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 90;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 80; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(80);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("80 rubles are " + dollar + " dollar.");
        int firstPoint = 140;
        int expectedOne = 1;
        int out = Converter.rubleToEuro(firstPoint);
        boolean passed = expectedOne == out;
        System.out.println("140 rubles are 1. Test result : " + passed);
        int secoundPoint = 80;
        int expectedTwo = 1;
        int outTwo = Converter.rubleToDollar(secoundPoint);
        boolean passedTwo = expectedTwo == outTwo;
        System.out.println("80 rubles are 1. Test result : " + passedTwo);
    }
}







