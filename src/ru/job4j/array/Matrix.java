package ru.job4j.array;

import java.util.Arrays;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] multiple = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size; j++) {
                multiple[i][j] = (i + 1) * (j + 1);
            }
        }
        return multiple;
    }
}