package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when5() {
        int[] data = new int[] {25, 12, 101, 77, 43};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {12, 25, 43, 77, 101};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when3() {
        int[] data = new int[] {19, 17, 12};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {12, 17, 19};
        Assert.assertArrayEquals(expected, result);
    }
}