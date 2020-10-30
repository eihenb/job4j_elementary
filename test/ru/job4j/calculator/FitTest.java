package ru.job4j.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void WhenManHeight187ThenWeight100() {
        short in = 187;
        double expected = 100.05;
        double out = Fit.manWeight(in);
        AssertThat.assertEquals(expected, out);
    }

    @Test
    public void WhenWomanHeight175ThenWeight74() {
        short in = 175;
        double expected = 74.75;
        double out = Fit.manWeight(in);
        AssertThat.assertEquals(expected, out);
    }
}