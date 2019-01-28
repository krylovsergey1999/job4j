package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSubtractTwoElement() {
        Calculator calc = new Calculator();
        calc.subtract(10, 9);
        double result = calc.getResult();
        double expected = 1;
        assertThat(result, is(expected));
    }

    @Test
    public void whenDivTwoElement() {
        Calculator calc = new Calculator();
        calc.div(16, 4);
        double result = calc.getResult();
        double expected = 4;
        assertThat(result, is(expected));
    }

    @Test
    public void whenMultiple() {
        Calculator calc = new Calculator();
        calc.multiple(12, 7);
        double result = calc.getResult();
        double expected = 84;
        assertThat(result, is(expected));
    }
}
