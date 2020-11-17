package ru.job4j.loop; //fix

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        int count = 2;
        for (int indexOne = count; indexOne < number; indexOne++) {
            if (number % indexOne == 0) {
                prime = false;
                break;
            }

        }
        return prime;
    }
}


















