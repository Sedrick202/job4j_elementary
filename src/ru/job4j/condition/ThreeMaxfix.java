package ru.job4j.condition;

public class ThreeMaxfix {
    public static int max(int first, int second, int third) {
        int result = third;
        if (first >= second && first >= third) {
            result = first;
        }
        else if (second >= first && second >= third) {
            result = second;
        }

        return result;
    }

    public static void main(String[] args) {
        int result2 = ThreeMaxfix.max(10,10,1);
        System.out.println(result2);
    }
}
