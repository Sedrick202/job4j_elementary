package ru.job4j.condition;

public class LogicNot {

    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public boolean isPositive(int num) {
        return num > 0;
    }

    public boolean notEven(int num) {
        return !(num % 2 == 0);
    }

    public boolean notPositive(int num) {
        return !(num > 0);
    }

    public static boolean notEvenAndPositive(int num) {
        if (!(num % 2 == 0) && num > 0) {
            System.out.println("true");
        } else {
             System.out.println("false");
        }
        return false;
    }

    public boolean evenOrNotPositive(int num) {
        return (!(num > 0) || num % 2 == 0);
    }

    public static void main(String[] args) {
         notEvenAndPositive(2);

    }

}
