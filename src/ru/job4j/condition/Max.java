package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean cond = left > right;
        int result = cond ? left : right;
        return result;
    }
}
