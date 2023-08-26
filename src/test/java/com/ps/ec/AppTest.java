package com.ps.ec;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

    private App app = new App();
    private Double delta = 0.01;

    @Test
    public void eightPlusFour() {
        assertEquals(8.0 + 4.0, app.sum(8, 4), delta);
    }

    @Test
    public void sevenPlusFive() {
        assertEquals(7.0 + 5.0, app.sum(7, 5), delta);
    }

    @Test
    public void zeroMinusEleven() {
        assertEquals(0.0 - 11.0, app.subtraction(0, 11), delta);
    }

    @Test
    public void oneMinusTen() {
        assertEquals(1.0 - 10.0, app.subtraction(1, 10), delta);
    }

    @Test
    public void eighteenByTen() {
        assertEquals(18.0 * 10.0, app.multiplication(18, 10), delta);
    }

    @Test
    public void twentyByTwo() {
        assertEquals(20.0 * 2.0, app.multiplication(20, 2), delta);
    }

    @Test
    public void oneIntoFour() {
        assertEquals(1.0 / 4.0, app.division(1, 4), delta);
    }

    @Test
    public void ninetyEightIntoTwo() {
        assertEquals(98.0 / 2.0, app.division(98, 2), delta);
    }
}
