package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort el = new BubbleSort();
        int[] arr  = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] result = el.sort(arr);
        int[] otvet = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(result, is(otvet));
        //напишите здесь тест, проверяющий сортировку массива из 10 элементов методом пузырька, например {1, 5, 4, 2, 3, 1, 7, 8, 0, 5}.
    }
}