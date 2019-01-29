package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {

    @Test
    public void whenSevenEl() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] input = {"1", "2", "3", "4", "5", "1", "6", "2", "7"};
        String[] expected = {"1", "2", "3", "4", "5", "6", "7"};
        String[] result = duplicate.remove(input);
        assertThat(result, is(expected));
    }

    @Test
    public void whenFiveEl() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] input = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] expected = {"Привет", "Мир", "Супер"};
        String[] result = duplicate.remove(input);
        assertThat(result, is(expected));
    }

    @Test
    public void whenFiveEl1() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] input = {"Привет", "Привет", "Привет", "Привет", "Привет"};
        String[] expected = {"Привет"};
        String[] result = duplicate.remove(input);
        assertThat(result, is(expected));
    }
}