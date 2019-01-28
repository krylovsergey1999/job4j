package ru.job4j.array;

public class BubbleSort {
    /**
     * Сортировка пузырьком.
     *
     * @param array - входной массив
     * @return - отсортированный массив
     */
    public int[] sort(int[] array) {
        int nElems = array.length;
        int out, in;
        for (out = nElems - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (array[in] > array[in + 1]) {
                    int temp = array[in];
                    array[in] = array[in + 1];
                    array[in + 1] = temp;
                }
            }
        }
        return array;
    }
}