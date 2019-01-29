package ru.job4j.array;

import java.util.Arrays;

public class ArrayDuplicate {
    /**
     * 6.8. Удаление дубликатов в массиве.[#109021]
     *
     * @param array массив
     * @return массив без дубликатов
     */
    public String[] remove(String[] array) {
        int l = array.length;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (array[i].equals(array[j])) {
                    for (int h = j; h < l - 1; h++)
                        array[h] = array[h + 1];
                    l--;
                    j--;
                }
            }
        }
        return Arrays.copyOf(array, l);
    }
}
