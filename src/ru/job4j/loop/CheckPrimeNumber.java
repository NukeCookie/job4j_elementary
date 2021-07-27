package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int index = 2; index < number; index++) {
            if (number % index == 0) {
                prime = false;
                break;
            }
        }
        if (number <= 1) {
            prime = false;
            System.out.println("В математике принято не относить единицу ни к простым, ни к составным числам.");
        }
        return prime;
    }
}