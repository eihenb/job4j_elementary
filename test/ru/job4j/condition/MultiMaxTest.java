package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(3,1,2);
        assertThat(result, is(3));
    }
    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1,3,2);
        assertThat(result, is(3));
    }
    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(1,2,3);
        assertThat(result, is(3));
    }
    @Test public void whenEqauls() {
        int result = MultiMax.max(1,1,1);
        assertThat(result, is(1));
    }
}