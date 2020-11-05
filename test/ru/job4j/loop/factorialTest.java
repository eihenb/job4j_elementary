package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class factorialTest {

    @Test
    public void whenFactorialForFiveThenOneHundreedTwenty() {
        int rsl = 120;
        int expected = factorial.calc(5);
        assertThat(rsl, is(expected));
    }
}