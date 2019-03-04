package ru.job4j.search;

import java.util.List;

public class ConvertList2Array {
    public int[][] toArray(List<Integer> list, int rows) {
        int size = list.size();
        int cells = size / rows * rows == size ? size / rows : size / rows + 1;
        int[][] array = new int[rows][cells];
        int i = 0, j = 0;
        for (Integer el : list) {
            array[i][j] = el;
            j++;
            if (j == cells) {
                j = 0;
                i++;
            }
        }
        return array;
    }
}
