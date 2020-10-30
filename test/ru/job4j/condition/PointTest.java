package ru.job4j.condition;

import org.junit.Test;
import ru.job4j.calculator.AssertThat;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00To20Then20() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2.0;
        double out = Point.distance(x1, y1, x2, y2);
        AssertThat.assertEquals(expected, out);
    }
    @Test
    public void when10To20Then1() {
        int x1 = 1;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 1.0;
        double out = Point.distance(x1, y1, x2, y2);
        AssertThat.assertEquals(expected, out);
    }
    @Test
    public void when20To20Then3() {
        int x1 = 2;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 3.6;
        double out = Point.distance(x1, y1, x2, y2);
        AssertThat.assertEquals(expected, out);
    }
}