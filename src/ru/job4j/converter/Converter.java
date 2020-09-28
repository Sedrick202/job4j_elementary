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
        int dollar = Converter.rubleToDollar(70);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("70 rubles are " + dollar + " dollar.");
    }

}
