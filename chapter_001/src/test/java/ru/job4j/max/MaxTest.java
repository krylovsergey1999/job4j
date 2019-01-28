package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenSecondLessFirst() {
        Max maxim = new Max();
        int result = maxim.max(10, 2);
        assertThat(result, is(10));
    }

    /**
     * Третье число наибольшее.
     */
    @Test
    public void whenThirdIsGreatest() {
        Max maxim = new Max();
        int result = maxim.max(1, 2, 3);
        assertThat(result, is(3));
    }

    /**
     * Второе число наибольшее.
     */
    @Test
    public void whenSecondIsGreatest() {
        Max maxim = new Max();
        int result = maxim.max(1, 20, 3);
        assertThat(result, is(20));
    }

    /**
     * Первое число наибольшее.
     */
    @Test
    public void whenFirstIsGreatest() {
        Max maxim = new Max();
        int result = maxim.max(100, 20, 3);
        assertThat(result, is(100));
    }
}
