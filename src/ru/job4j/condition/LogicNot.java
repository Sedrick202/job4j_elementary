package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
       return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !(num % 2 == 0);
    }

    public static boolean notPositive(int num) {
        return !(num > 0);
    }

    public static boolean notEvenAndPositive(int num) {
        return  (!(num % 2 == 0) && num > 0);

    }

    public static boolean evenOrNotPositive(int num) {
        return (!(num > 0) || num % 2 == 0);
    }

    public static void main(String[] args) {
        boolean result1 = isEven(2);
        System.out.println(result1);
        boolean result2 = isPositive(2);
        System.out.println(result2);
        boolean result3 = notEven(2);
        System.out.println(result3);
        boolean result4 = notPositive(2);
        System.out.println(result4);
        boolean result5 = notEvenAndPositive(2);
        System.out.println(result5);
        boolean result6 = evenOrNotPositive(2);
        System.out.println(result6);

    }

}
