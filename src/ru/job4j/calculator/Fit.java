package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 167;
        double man = Fit.manWeight(height);
        System.out.println("Man 167 is " + man);
        double woman = Fit.womanWeight(height);
        System.out.println("Woman 167 is " + woman);
    }
}
