package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to02then2() {
        int expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
    @Test
    public void when32to15then3point61() {
        double expected = 3.61;
        Point a = new Point(3, 2);
        Point b = new Point(1, 5);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when66to28then4point47() {
        double expected = 4.47;
        Point a = new Point(6, 6);
        Point b = new Point(2, 8);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when357to468then1point73() {
        double expected = 1.73;
        Point a = new Point(3, 5, 7);
        Point b = new Point(4, 6, 8);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when123to456then4point69() {
        double expected = 4.69;
        Point a = new Point(1, 2, 3);
        Point b = new Point(4, 5, 5);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when897to231then10point39() {
        double expected = 10.39;
        Point a = new Point(8, 9, 7);
        Point b = new Point(2, 3, 1);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}
