package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap2to4() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int source = 2;
        int dest = 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 5, 4, 3, 6, 7, 8, 9};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap3to8() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int source = 3;
        int dest = 8;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 9, 5, 6, 7, 8, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap4to1() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int source = 4;
        int dest = 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 5, 3, 4, 2, 6, 7, 8, 9};
        Assert.assertArrayEquals(expected, result);
    }
}