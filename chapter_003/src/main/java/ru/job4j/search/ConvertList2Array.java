package ru.job4j.search;

import java.util.List;

public class ConvertList2Array {
    public int[][] toArray(List<Integer> list, int rows) {
        int size = list.size();
        int cells = size / rows * rows == size ? size / rows : size / rows + 1;
        int[][] array = new int[rows][cells];
        int check = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cells; j++) {
                if (check < size) {
                    array[i][j] = list.get(check);
                    check++;
                } else
                    array[i][j] = 0;
            }
        }
        return array;
    }
}
