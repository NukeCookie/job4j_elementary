package ru.job4j.condition;

public class Club {
    public static void permission(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) {
            System.out.println("I can go to the game club.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        Club.permission(true, true);
        Club.permission(true, false);
        Club.permission(false, true);
        Club.permission(false, false);
    }
}