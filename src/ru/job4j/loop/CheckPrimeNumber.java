package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        int count = 2;
        for (int indexOne = count; count < number; indexOne++) {
            if (number % indexOne == 0) {
                prime = false;
                break;

            }
        }
        return prime;
    }

    public static void main(String[] args) {
        System.out.println(check(5));
    }
}
















