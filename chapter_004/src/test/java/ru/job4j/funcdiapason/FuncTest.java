package ru.job4j.funcdiapason;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FuncTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = Func.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenKvadratFunction() {
        List<Double> result = Func.diapason(1, 4, x -> x * x - 2 * x + 1);
        List<Double> expected = Arrays.asList(0D, 1D, 4D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLogFunction() {
        List<Double> result = Func.diapason(1, 3, x -> Math.log(x) / Math.log(2) + 5);
        List<Double> expected = Arrays.asList(5D, 6D);
        assertThat(result, is(expected));
    }
}
