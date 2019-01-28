package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void whenBound3Then149() {
        int bound = 3;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[]{1, 4, 9};
        /*
        Важно.
        assertThat(rst, is(expect)); - мы сравниваем целиком массивы, а не отдельные числа.
         */
        assertThat(rst, is(expect));
    }

    @Test
    public void fiveElements() {
        int bound = 5;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[]{1, 4, 9, 16, 25};
        /*
        Важно.
        assertThat(rst, is(expect)); - мы сравниваем целиком массивы, а не отдельные числа.
         */
        assertThat(rst, is(expect));
    }

    @Test
    public void sixElements() {
        int bound = 6;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[]{1, 4, 9, 16, 25, 36};
        /*
        Важно.
        assertThat(rst, is(expect)); - мы сравниваем целиком массивы, а не отдельные числа.
         */
        assertThat(rst, is(expect));
    }
}
