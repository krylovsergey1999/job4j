package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter el = new Counter();
        int res = el.add(1, 10);
        assertThat(res, is(30));
        //напишите здесь тест, проверяющий, что сумма чётных чисел от 1 до 10 при вызове метода counter.add будет равна 30.
    }

    @Test
    public void fromOneToHundred() {
        Counter el = new Counter();
        int res = el.add(1, 100);
        assertThat(res, is(2550));
    }
}