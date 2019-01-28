package ru.job4j.loop;

import org.junit.Test;

import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {

    @Test
    public void whenPyramid4Left() {
        Paint paint = new Paint();
        String rst = paint.leftTrl(4);
        System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("   ^")
                                .add("  ^^")
                                .add(" ^^^")
                                .add("^^^^")
                                .toString()
                )
        );
    }

    @Test
    public void whenPyramid4Right() {
        Paint paint = new Paint();
        String rst = paint.rightTrl(4);
        System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("^   ")
                                .add("^^  ")
                                .add("^^^ ")
                                .add("^^^^")
                                .toString()
                )
        );
    }

    @Test
    public void when3() {
        Paint pir = new Paint();
        String rsl = pir.pyramid(3);
        System.out.println(rsl);
        String ln = System.lineSeparator();
        assertThat(rsl, is(String.format("  ^  %s ^^^ %s^^^^^%s", ln, ln, ln)));
    }

    @Test
    public void when2() {
        Paint pir = new Paint();
        String rsl = pir.pyramid(2);
        System.out.println(rsl);
        String ln = System.lineSeparator();
        assertThat(rsl, is(String.format(" ^ %s^^^%s", ln, ln)));
    }
}
