package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SummationTest {

    @Test
    public void when1and2thenMax2() {
        int res = Summation.max(1,2);
        assertThat(res, is(2));
    }

    @Test
    public void when2and2thenEquals() {
        int res = Summation.max(2,2);
        assertThat(res, is(2));
    }

    @Test
    public void when5and1then5() {
        int res = Summation.max(5,1);
        assertThat(res, is(5));
    }
}