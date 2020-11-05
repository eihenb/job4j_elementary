package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void sum() {
        int rsl = Counter.sum(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }
}