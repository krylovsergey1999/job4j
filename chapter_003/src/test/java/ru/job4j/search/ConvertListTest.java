package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertListTest {
    @Test
    public void whenConvertList() {
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{1, 2});
        list.add(new int[]{3, 4, 5, 6});
        List<Integer> result = new ConvertList().convert(list);
        List<Integer> arr = new ArrayList<>();
        for (int i = 1; i < 7; i++) {
            arr.add(i);
        }
        assertThat(result, is(arr));
    }
}
