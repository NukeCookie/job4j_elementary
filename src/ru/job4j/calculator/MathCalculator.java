package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double minusAndDivide(double first, double second) {
        return minus(first, second)
                + divide(first, second);
    }

    public static double totalSum(double first, double second) {
        return divide(first, second)
                + multiply(first, second)
                + sum(first, second)
                + minus(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат сложения равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат вычетания равен: " + minusAndDivide(10, 20));
        System.out.println("Результат сложения всех операций равен: " + totalSum(10, 20));
    }
}