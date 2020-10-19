package ru.job4j.condition;

public class Max {
    public static String max(int left, int right) {
        String result = left > right ? "left" : "right";
        return result;
    }

    public static void main(String[] args) {
       String one = Max.max(5, 8);
       System.out.println(one);

    }
}

