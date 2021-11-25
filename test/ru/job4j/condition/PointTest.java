package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        int expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
    @Test
    public void when32to10then2() {
        double expected = 3.61;
        Point a = new Point(3, 2);
        Point b = new Point(1, 5);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when66to22then5() {
        double expected = 4.47;
        Point a = new Point(6, 6);
        Point b = new Point(2, 8);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}
