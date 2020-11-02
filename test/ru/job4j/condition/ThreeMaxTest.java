package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ThreeMaxTest {

    @Test
    public void firstMax() {
        int rsl = ThreeMax.max(5, 2,1);
        assertThat(rsl, is(5));
    }
    @Test
    public void secondMax() {
        int rsl = ThreeMax.max(10, 50,25);
        assertThat(rsl, is(50));
    }
    @Test
    public void thirdMax() {
        int rsl = ThreeMax.max(5, 2,200);
        assertThat(rsl, is(200));
    }
    @Test
    public void firstEqSecond() {
        int rsl = ThreeMax.max(5, 5,1);
        assertThat(rsl, is(5));
    }
    @Test
    public void firstEqThird() {
        int rsl = ThreeMax.max(5, 1,5);
        assertThat(rsl, is(5));
    }
    @Test
    public void secondEqThird() {
        int rsl = ThreeMax.max(10, 50,50);
        assertThat(rsl, is(50));
    }
}