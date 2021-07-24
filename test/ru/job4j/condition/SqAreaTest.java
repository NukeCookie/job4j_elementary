package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K2Square5() {
        double expected = 5.56;
        int p = 10;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP20K5Square13() {
        double expected = 13.89;
        int p = 20;
        double k = 5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}