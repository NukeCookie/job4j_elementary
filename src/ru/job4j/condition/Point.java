package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x;

    private int y;

    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public void info() {
        System.out.println("Point[" + this.x + ", " + this.y + "]");
    }

    public void info3d() {
        System.out.println("Point[" + this.x + ", " + this.y + ", " + this.z + "]");
    }

    public static void main(String[] args) {
        Point a = new Point(6, 6);
        Point b = new Point(2, 8);
        Point c = new Point(3, 5, 7);
        Point d = new Point(4, 6, 8);
        a.info();
        b.info();
        System.out.println(a.distance(b));
        c.info3d();
        d.info3d();
        System.out.println(c.distance3d(d));
    }
}